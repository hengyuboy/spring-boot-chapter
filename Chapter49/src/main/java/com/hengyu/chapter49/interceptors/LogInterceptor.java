package com.hengyu.chapter49.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 日志拦截器
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/15
 * Time：下午10:31
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Component
public class LogInterceptor implements HandlerInterceptor {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        logger.info("请求路径：{}", request.getRequestURI());
        return true;
    }
}
