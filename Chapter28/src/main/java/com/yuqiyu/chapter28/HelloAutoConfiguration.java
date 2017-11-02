package com.yuqiyu.chapter28;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义starter自动化配置
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/22
 * Time：22:56
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration//开启配置
@EnableConfigurationProperties(HelloProperties.class)//开启使用映射实体对象
@ConditionalOnClass(HelloService.class)//存在HelloService时初始化该配置类
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (
                prefix = "hello",//存在配置前缀hello
                value = "enabled",//开启
                matchIfMissing = true//缺失检查
        )
public class HelloAutoConfiguration
{

    //application.properties配置文件映射前缀实体对象
    @Autowired
    private HelloProperties helloProperties;

    /**
     * 根据条件判断不存在HelloService时初始化新bean到SpringIoc
     * @return
     */
    @Bean//创建HelloService实体bean
    @ConditionalOnMissingBean(HelloService.class)//缺失HelloService实体bean时，初始化HelloService并添加到SpringIoc
    public HelloService helloService()
    {
        System.out.println(">>>The HelloService Not Found，Execute Create New Bean.");
        HelloService helloService = new HelloService();
        helloService.setMsg(helloProperties.getMsg());//设置消息内容
        helloService.setShow(helloProperties.isShow());//设置是否显示
        return helloService;
    }
}
