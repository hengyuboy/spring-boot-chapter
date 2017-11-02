package com.yuqiyu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义401错误码内容
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/22
 * Time：16:53
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private final Logger log = LoggerFactory.getLogger(CustomAuthenticationEntryPoint.class);

    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException ae) throws IOException, ServletException {

        log.info("Pre-authenticated entry point called. Rejecting access");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Access Denied");

    }
}