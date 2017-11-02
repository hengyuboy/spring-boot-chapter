package com.yuqiyu.chapter22.bean;

import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/5/4
 * Time：22:14
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class UserBean implements Serializable
{
    //用户名
    private String name;
    //密码
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
