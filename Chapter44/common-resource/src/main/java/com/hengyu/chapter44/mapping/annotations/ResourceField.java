package com.hengyu.chapter44.mapping.annotations;

import com.hengyu.chapter44.mapping.enums.CommonResourceFlag;

import java.lang.annotation.*;

/**
 * 配置统一资源字段
 * 该注解配置在普通字段上，根据配置信息自动查询对应的资源地址
 * Demo：
 *
 * @ResourceField(flag=CommonResourceFlagEnum.SHOP_COVER_IMG)
 * private String shopCoverImage;
 *
 * 其中multiple不需要配置，因为封面只有一张，使用默认值即可
 * flag设置为对应的资源标识，资源类型不存在时不执行查询
 * @ResourceTargetId 如果注解不存在或目标编号不存在或者为null、""时不执行查询资源
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with Eclipse.
 * Date：2017/12/31
 * Time：13:11
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface ResourceField {

    /**
     * 读取资源是单条或者读条
     * true：读取多条资源地址，对应设置到List<String>集合内
     * false：读取单条资源地址，对应设置配置ResourceField注解的字段value
     * @return
     */
    boolean multiple() default false;

    /**
     * 配置读取统一资源的标识类型
     * @return
     */
    CommonResourceFlag flag();

    /**
     * 如果配置该字段则不会去找@Id配置的字段
     * 该字段默认为空，则默认使用@Id标注的字段的值作为查询统一资源的target_id
     * @return
     */
    String targetIdField() default "";
}
