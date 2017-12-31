package com.hengyu.chapter44.mapping.enums;

import lombok.Getter;

/**
 * 资源标识枚举
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：下午3:40
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Getter
public enum CommonResourceFlag
{
    /**
     * 用户头像
     */
    USER_HEAD_IMAGE("USER_HEAD_IMAGE"),
    /**
     * 用户背景图片
     */
    USER_BACK_IMAGE("USER_BACK_IMAGE");
    private String name;

    CommonResourceFlag(String name) {
        this.name = name;
    }
}
