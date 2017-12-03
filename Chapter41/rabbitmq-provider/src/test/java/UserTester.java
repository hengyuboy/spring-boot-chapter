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
}
