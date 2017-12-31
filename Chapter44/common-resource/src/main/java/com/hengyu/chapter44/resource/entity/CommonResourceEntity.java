package com.hengyu.chapter44.resource.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 资源实体
 * @author yuqiyu
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：上午11:21
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Data
@Entity
@Table(name = "hy_common_resource")
public class CommonResourceEntity
    extends BaseEntity
{
    /**
     * 资源编号
     */
    @Column(name = "CR_ID")
    @Id
    @GeneratedValue
    private Integer resourceId;
    /**
     * 资源所属目标编号
     */
    @Column(name = "CR_TARGET_ID")
    private String targetId;
    /**
     * 类型编号
     */
    @Column(name = "CR_TYPE_ID")
    private String typeId;
    /**
     * 资源路径
     */
    @Column(name = "CR_URL")
    private String resourceUrl;
    /**
     * 创建时间
     */
    @Column(name = "CR_CREATE_TIME")
    private Timestamp createTime;
    /**
     * 排序
     */
    @Column(name = "CR_ORDER")
    private int order;
}
