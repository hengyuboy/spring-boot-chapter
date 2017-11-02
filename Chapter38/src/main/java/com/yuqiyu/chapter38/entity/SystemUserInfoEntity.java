package com.yuqiyu.chapter38.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户基本信息实体
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/10/29
 * Time：08:25
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "system_user_info")
@Data
public class SystemUserInfoEntity
{
    /**
     * 主键
     */
    @Column(name = "SUI_ID")
    @GeneratedValue
    @Id
    private Integer id;
    /**
     * 昵称
     */
    @Column(name = "SUI_NICK_NAME")
    private String nickName;
    /**
     * 登录名
     */
    @Column(name = "SUI_LOGIN_NAME")
    private String loginName;
    /**
     * 登录密码
     */
    @Column(name = "SUI_LOGIN_PASSWORD")
    private String loginPassword;
}
