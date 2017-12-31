import com.hengyu.chapter44.Chapter44Application;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 测试用例
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：下午5:04
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@SpringBootTest(classes = Chapter44Application.class)
@RunWith(SpringRunner.class)
public class CommonResourceTester
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
     * 测试查询用户详情
     * @throws Exception
     */
    @Test
    public void selectDetail() throws Exception
    {
        /**
         * 发起获取请求
         */
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/hengboy"))
        .andDo(MockMvcResultHandlers.log())
        .andReturn();

        int status = mvcResult.getResponse().getStatus();

        mvcResult.getResponse().setCharacterEncoding("UTF-8");
        String responseString = mvcResult.getResponse().getContentAsString();

        Assert.assertEquals("请求错误", 200, status);

        System.out.println(responseString);
    }
}
