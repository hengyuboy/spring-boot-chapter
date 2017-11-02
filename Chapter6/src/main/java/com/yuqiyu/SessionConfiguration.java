package com.yuqiyu;

import com.yuqiyu.chapter6.SessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/7
 * Time：21:47
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class SessionConfiguration extends WebMvcConfigurerAdapter
{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
    }
}
