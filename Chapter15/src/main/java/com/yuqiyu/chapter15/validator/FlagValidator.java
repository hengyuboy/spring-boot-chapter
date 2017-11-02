package com.yuqiyu.chapter15.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/16
 * Time：16:47
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = FlagValidatorClass.class)
public @interface FlagValidator
{
    //flag的有效值多个使用','隔开
    String values();
    //提示内容
    String message() default "flag不存在";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
