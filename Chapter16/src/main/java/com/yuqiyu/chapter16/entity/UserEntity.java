package com.yuqiyu.chapter16.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/4
 * Time：15:38
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable
{

    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
