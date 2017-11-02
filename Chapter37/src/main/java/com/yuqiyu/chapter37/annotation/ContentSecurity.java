package com.yuqiyu.chapter37.annotation;

import com.yuqiyu.chapter37.enums.ContentSecurityAway;

import java.lang.annotation.*;

/**
 * 配置开启安全
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/10/11
 * Time：22:55
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ContentSecurity
{
    /**
     * 内容加密方式
     * 默认DES
     * @return
     */
    ContentSecurityAway away() default ContentSecurityAway.DES;
}
