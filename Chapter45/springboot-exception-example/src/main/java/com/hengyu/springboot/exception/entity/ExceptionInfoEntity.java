package com.hengyu.springboot.exception.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统异常基本信息实体
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2018/1/7
 * Time：下午3:35
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 * @author yuqiyu
 */
@Data
@Entity
@Table(name = "sys_exception_info")
public class ExceptionInfoEntity implements Serializable{
    /**
     * 异常消息编号
     */
    @Id
    @GeneratedValue
    @Column(name = "EI_ID")
    private Integer id;
    /**
     * 异常消息错误码
     */
    @Column(name = "EI_CODE")
    private String code;
    /**
     * 异常消息内容
     */
    @Column(name = "EI_MESSAGE")
    private String message;
}
