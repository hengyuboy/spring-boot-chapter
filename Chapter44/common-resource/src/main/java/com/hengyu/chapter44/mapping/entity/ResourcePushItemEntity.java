package com.hengyu.chapter44.mapping.entity;

import com.hengyu.chapter44.mapping.annotations.ResourceField;
import lombok.Data;

import java.lang.reflect.Field;

/**
 * 资源设置项目实体
 * 一个实例对应一个@ResourceField注解配置
 * @author：于起宇 <br/>
 * ===============================
 * Created with Eclipse.
 * Date：2017/12/15
 * Time：21:27
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Data
public class ResourcePushItemEntity {
    /**
     * 实体内配置@ResourceField的字段
     */
    private Field resourceField;
    /**
     * 实体内配置@ResourceField的targetId的值对应的字段
     */
    private Field targetIdField;
    /**
     * 配置资源注解实例
     */
    private ResourceField resourceAnnotation;
}
