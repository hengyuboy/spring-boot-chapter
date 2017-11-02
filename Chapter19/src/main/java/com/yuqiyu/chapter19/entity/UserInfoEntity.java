package com.yuqiyu.chapter19.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/3/27
 * Time：23:16
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "api_user_infos",schema = "jwt")
public class UserInfoEntity implements Serializable
{
    @Id
    @Column(name = "aui_app_id")
    private String appId;

    @Column(name = "aui_app_secret")
    private byte[] appSecret;

    @Column(name = "aui_status")
    private int status;

    @Column(name = "aui_day_request_count")
    private int dayRequestCount;

    @Column(name = "aui_ajax_bind_ip")
    private String ajaxBindIp;

    @Column(name = "aui_mark")
    private String mark;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public byte[] getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(byte[] appSecret) {
        this.appSecret = appSecret;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDayRequestCount() {
        return dayRequestCount;
    }

    public void setDayRequestCount(int dayRequestCount) {
        this.dayRequestCount = dayRequestCount;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getAjaxBindIp() {
        return ajaxBindIp;
    }

    public void setAjaxBindIp(String ajaxBindIp) {
        this.ajaxBindIp = ajaxBindIp;
    }
}
