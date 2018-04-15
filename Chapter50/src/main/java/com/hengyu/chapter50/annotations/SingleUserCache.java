package com.hengyu.chapter50.annotations;

import org.springframework.cache.annotation.Cacheable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义单个用户缓存模板注解
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/4/14
 * Time：下午10:25
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Cacheable(cacheNames = "user.service.detail", key = "#userId", unless = "#result?.userAge > 20")
public @interface SingleUserCache {
}
