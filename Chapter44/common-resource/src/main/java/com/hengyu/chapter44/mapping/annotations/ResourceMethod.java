package com.hengyu.chapter44.mapping.annotations;

import java.lang.annotation.*;

/**
 * 配置指定方法将会被AOP切面类ResourceAspect所拦截
 * 拦截后会根据自定义注解进行查询资源 & 设置资源等逻辑
 * @author：于起宇 <br/>
 * ===============================
 * Created with Eclipse.
 * Date：2017/12/15
 * Time：14:04
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface ResourceMethod { }
