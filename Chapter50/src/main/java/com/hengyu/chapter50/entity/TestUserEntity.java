package com.hengyu.chapter50.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 测试用户基本信息
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/4/15
 * Time：下午2:45
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Entity
@Table(name = "test_user_info")
@Data
public class TestUserEntity implements Serializable {

    @Id
    @Column(name = "ui_id")
    @GeneratedValue
    private Integer userId;

    @Column(name = "ui_name")
    private String userName;

    @Column(name = "ui_password")
    private String userPassword;

    @Column(name = "ui_age")
    private Integer userAge;
}
