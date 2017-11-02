package com.yuqiyu.chapter37.annotation;

import java.lang.annotation.*;

/**
 * 配置该注解表示从request.attribute内读取对应实体参数值
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/10/11
 * Time：23:02
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ContentSecurityAttribute {
    /**
     * 参数值
     * 对应配置@ContentSecurityAttribute注解的参数名称即可
     * @return
     */
    String value();
}
