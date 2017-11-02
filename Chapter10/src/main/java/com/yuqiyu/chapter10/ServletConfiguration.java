package com.yuqiyu.chapter10;

import com.yuqiyu.chapter10.servlet.TestServlet;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/11
 * Time：22:25
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
@ServletComponentScan
public class ServletConfiguration {

    /*@Bean
    public ServletRegistrationBean servletRegistrationBean()
    {
        return new ServletRegistrationBean(new TestServlet(),"/test");
    }*/
}
