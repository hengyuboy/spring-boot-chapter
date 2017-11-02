package com.yuqiyu.chapter36.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 参数实体映射注解
 * 配置该注解的参数会使用 com.yuqiyu.chapter36.resovler.CustomerArgumentResolver类完成参数装载
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/9/16
 * Time：22:19
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Target(value = ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParameterModel
{

}
