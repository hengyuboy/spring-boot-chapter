package com.yuqiyu.chapter19;

import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/22
 * Time：22:43
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class TokenResult implements Serializable{
    //状态
    private boolean flag = true;
    //返回消息内容
    private String msg = "";
    //返回token值
    private String token ="";

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
