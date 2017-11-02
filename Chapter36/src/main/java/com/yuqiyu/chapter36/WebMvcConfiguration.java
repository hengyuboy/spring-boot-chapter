package com.yuqiyu.chapter36;

import com.yuqiyu.chapter36.resovler.CustomerArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
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
     * 添加参数装载
     * @param argumentResolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        /**
         * 将自定义的参数装载添加到spring内托管
         */
        argumentResolvers.add(new CustomerArgumentResolver());
    }

    /**
     * 配置静态请求视图映射
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
    }
}
