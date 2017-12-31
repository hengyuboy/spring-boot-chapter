package com.hengyu.chapter44.mapping.service;

import java.util.List;

/**
 * 统一资源设置业务逻辑定义接口
 * @author：于起宇 <br/>
 * ===============================
 * Created with Eclipse.
 * Date：2017/12/15
 * Time：14:58
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
public interface ResourcePushService
{
    /**
     * 设置单个实例的资源信息
     * @param object 需要设置资源的实例
     */
    void push(Object object) throws Exception;

    /**
     * 设置多个实例的资源信息
     * @param objectList 需要设置资源的实例列表
     */
    void push(List<Object> objectList) throws Exception;
}
