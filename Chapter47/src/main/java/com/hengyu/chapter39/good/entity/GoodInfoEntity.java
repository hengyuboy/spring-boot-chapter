package com.hengyu.chapter39.good.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/5
 * Time：14:59
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "basic_good_info")
@Data
public class GoodInfoEntity {
    /**
     * 商品编号
     */
    @Id
    @GeneratedValue
    @Column(name = "bgi_id")
    private Long id;
    /**
     * 商品名称
     */
    @Column(name = "bgi_name")
    private String name;
    /**
     * 商品单位
     */
    @Column(name = "bgi_unit")
    private String unit;
    /**
     * 商品单价
     */
    @Column(name = "bgi_price")
    private BigDecimal price;
}
