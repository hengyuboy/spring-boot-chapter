package com.hengyu.springboot.exception.common;

import lombok.Builder;
import lombok.Data;

/**
 * 接口响应实体
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2018/1/9
 * Time：下午3:04
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 * @author yuqiyu
 */
@Data
@Builder
public class ApiResponseEntity<T extends Object> {
    /**
     * 错误消息
     */
    private String errorMsg;
    /**
     * 数据内容
     */
    private T data;
}
