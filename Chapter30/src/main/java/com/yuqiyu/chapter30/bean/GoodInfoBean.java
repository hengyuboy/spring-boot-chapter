package com.yuqiyu.chapter30.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/8/14
 * Time：23:16
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "good_infos")
@Data
public class GoodInfoBean
{
    @Id
    @Column(name = "tg_id")
    private Long id;
    @Column(name = "tg_title")
    private String title;
    @Column(name = "tg_price")
    private double price;
    @Column(name = "tg_order")
    private int order;
    @Column(name = "tg_type_id")
    private Long typeId;
}
