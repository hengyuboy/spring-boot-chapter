package com.yuqiyu.chapter30.dto;

import lombok.Data;

/**
 * 转换Dto
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/8/20
 * Time：11:25
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Data
public class GoodInfoDTO
{
    //商品编号
    private String goodId;
    //商品名称
    private String goodName;
    //商品价格
    private double goodPrice;
    //类型名称
    private String typeName;
}
