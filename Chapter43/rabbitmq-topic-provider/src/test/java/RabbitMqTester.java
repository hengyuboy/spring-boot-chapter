import com.hengyu.rabbitmq.provider.RabbitMqTopicProviderApplication;
import com.hengyu.rabbitmq.provider.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/12/11
 * Time：22:10
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqTopicProviderApplication.class)
public class RabbitMqTester
{
    /**
     * 用户业务逻辑
     */
    @Autowired
   private UserService userService;

    /**
     * 模拟随机创建用户 & 发送消息到注册用户消息队列
     * @throws Exception
     */
    @Test
    public void testTopicMessage() throws Exception
    {
        userService.randomCreateUser();
    }
}
