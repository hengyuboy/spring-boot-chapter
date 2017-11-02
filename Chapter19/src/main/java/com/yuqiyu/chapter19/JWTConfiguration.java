package com.yuqiyu.chapter19;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/22
 * Time：23:10
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class JWTConfiguration extends WebMvcConfigurerAdapter
{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JwtTokenInterceptor()).addPathPatterns("/api/**");
    }
}
