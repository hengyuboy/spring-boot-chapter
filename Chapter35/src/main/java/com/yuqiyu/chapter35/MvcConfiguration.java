package com.yuqiyu.chapter35;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/9/13
 * Time：22:37
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter
{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**");
    }
}
