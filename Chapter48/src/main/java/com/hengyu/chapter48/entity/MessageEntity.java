package com.hengyu.chapter48.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 消息实体
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/11
 * Time：下午5:18
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Data
public class MessageEntity implements Serializable {
    /**
     * 消息内容
     */
    private String content;
}
