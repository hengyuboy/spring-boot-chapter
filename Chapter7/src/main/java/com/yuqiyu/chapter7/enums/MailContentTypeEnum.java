package com.yuqiyu.chapter7.enums;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/8
 * Time：20:23
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"), //html格式
    TEXT("text")
    ;
    private String value;

    MailContentTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
