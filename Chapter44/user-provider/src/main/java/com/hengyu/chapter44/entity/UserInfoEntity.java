package com.hengyu.chapter44.entity;

import com.hengyu.chapter44.resource.entity.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户基本信息实体
 * @author yuqiyu
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：上午11:18
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Data
@Entity
@Table(name = "hy_user_info")
public class UserInfoEntity
    extends BaseEntity
{
    /**
     * 用户编号
     */
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "UI_ID")
    private String userId;
    /**
     * 用户名
     */
    @Column(name = "UI_NAME")
    private String userName;
    /**
     * 昵称
     */
    @Column(name = "UI_NICK_NAME")
    private String nickName;
    /**
     * 年龄
     */
    @Column(name = "UI_AGE")
    private int age;
    /**
     * 所居地
     */
    @Column(name = "UI_ADDRESS")
    private String address;
}
