package com.hengyu.chapter48;

import org.springframework.amqp.support.converter.DefaultClassMapper;

/**
 * fastjson 转换映射
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/13
 * Time：下午10:17
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
public class RabbitMqFastJsonClassMapper extends DefaultClassMapper {
    /**
     * 构造函数初始化信任所有pakcage
     */
    public RabbitMqFastJsonClassMapper() {
        super();
        setTrustedPackages("*");
    }
}
