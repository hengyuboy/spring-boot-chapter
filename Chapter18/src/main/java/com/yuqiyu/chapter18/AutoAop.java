package com.yuqiyu.chapter18;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/26
 * Time：下午11:21
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
@Aspect
public class AutoAop
{


    @Around("@annotation(requestMapping)")
    public Object authAround(ProceedingJoinPoint joinPoint, RequestMapping requestMapping) throws Throwable
    {
        Object result = joinPoint.proceed();
        System.out.println(result);
        return result;
    }


    @AfterReturning(pointcut = "execution(* org.springframework.security.oauth2.*.*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("[Aspect1] afterReturning advise");
    }
}
