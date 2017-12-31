package com.hengyu.chapter44.mapping.entity;

import lombok.Data;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 资源定义字段实体
 * 该实体用于获取实体内初始化资源时的字段
 * @author：于起宇 <br/>
 * ===============================
 * Created with Eclipse.
 * Date：2017/12/15
 * Time：15:12
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Data
public class ResourcePushEntity
{
    /**
     * 实体内的主键字段
     */
    private Field idField;
    /**
     * 资源设置项目实体列表
     * 用于处理一个实体内对应多个资源注解配置
     */
    private List<ResourcePushItemEntity> items = new ArrayList<ResourcePushItemEntity>();
}
