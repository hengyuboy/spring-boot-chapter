package com.hengyu.chapter49;

import com.hengyu.chapter49.interceptors.LogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web相关配置类
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/17
 * Time：下午4:45
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
//@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    /**
     * 日志拦截器
     */
    @Autowired
    private LogInterceptor logInterceptor;

    /**
     * 重写添加拦截器方法并添加配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(logInterceptor).addPathPatterns("/**");
    }
}
