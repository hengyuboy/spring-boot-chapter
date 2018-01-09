package com.hengyu.springboot.exception.core.message;

/**
 * 逻辑异常接口定义
 * 使用项目需要实现该接口方法并提供方法实现
 * errCode对应逻辑异常码
 * getMessage返回字符串为逻辑异常消息内容
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2018/1/7
 * Time：下午2:41
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 * @author yuqiyu
 */
public interface LogicExceptionMessage {

    /**
     * 获取异常消息内容
     * @param errCode 错误码
     * @return
     */
    public String getMessage(String errCode);
}
