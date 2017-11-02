package com.yuqiyu;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/11
 * Time：20:55
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class Chapter9Configuration extends WebMvcConfigurerAdapter
{
    //自定义静态资源文件路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/yuqiyu/9/resources/**").addResourceLocations("classpath:/static/");
    }
}
