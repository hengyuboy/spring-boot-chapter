package com.yuqiyu.chapter25.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/6/6
 * Time：22:40
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter
{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
       /* registry
                .addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*");*/
    }
}
