package com.yuqiyu;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/27
 * Time：22:20
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
    }
}
