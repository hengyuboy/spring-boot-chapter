package com.yuqiyu.chapter37;

import com.yuqiyu.chapter37.interceptor.ContentSecurityInterceptor;
import com.yuqiyu.chapter37.resovler.ContentSecurityMethodArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * springmvc 注解式配置类
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/9/16
 * Time：22:15
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class WebMvcConfiguration
    extends WebMvcConfigurerAdapter
{
    /**
     * 配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ContentSecurityInterceptor()).addPathPatterns("/**");
    }

    /**
     * 添加参数装载
     * @param argumentResolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        /**
         * 将自定义的参数装载添加到spring内托管
         */
        argumentResolvers.add(new ContentSecurityMethodArgumentResolver());
    }
}
