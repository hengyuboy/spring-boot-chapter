package com.yuqiyu;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/18
 * Time：23:10
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/main").setViewName("main");
    }
}
