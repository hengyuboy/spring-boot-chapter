import com.hengyu.rabbitmq.provider.RabbitmqProviderApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：16:26
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitmqProviderApplication.class)
public class UserTester
{
    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * web项目上下文
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

    /**
     * 所有测试方法执行之前执行该方法
     */
    @Before
    public void before() {
        //获取mockmvc对象实例
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    /**
     * 测试添加用户
     * @throws Exception
     */
    @Test
    public void testUserAdd() throws Exception
    {
        mockMvc.perform(MockMvcRequestBuilders.post("/user/save")
                .param("userName","yuqiyu")
                .param("name","恒宇少年")
                .param("age","23")
        )
                .andDo(MockMvcResultHandlers.log())
                .andReturn();
    }

    /**
     * 测试用户批量添加
     * @throws Exception
     */
    @Test
    public void testBatchUserAdd() throws Exception
    {
        for (int i = 0 ; i < 10 ; i++) {
            //创建用户注册线程
            Thread thread = new Thread(new BatchRabbitTester(i));
            //启动线程
            thread.start();
        }
        //等待线程执行完成
        Thread.sleep(2000);
    }

    /**
     * 批量添加用户线程测试类
     * run方法发送用户注册请求
     */
    class BatchRabbitTester implements Runnable
    {
        private int index;
        public BatchRabbitTester() { }

        public BatchRabbitTester(int index) {
            this.index = index;
        }


        @Override
        public void run() {
            try {
                mockMvc.perform(MockMvcRequestBuilders.post("/user/save")
                        .param("userName","yuqiyu" + index)
                        .param("name","恒宇少年" + index)
                        .param("age","23")
                )
                        .andDo(MockMvcResultHandlers.log())
                        .andReturn();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
