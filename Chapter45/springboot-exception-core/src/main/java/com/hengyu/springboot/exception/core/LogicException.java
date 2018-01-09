package com.hengyu.springboot.exception.core;

import com.hengyu.springboot.exception.core.tools.ErrorMessageTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义业务逻辑异常类
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2018/1/7
 * Time：下午2:38
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 *
 * @author yuqiyu
 */
public class LogicException extends RuntimeException {

    /**
     * 日志对象
     */
    private Logger logger = LoggerFactory.getLogger(LogicException.class);

    /**
     * 错误消息内容
     */
    protected String errMsg;
    /**
     * 错误码
     */
    protected String errCode;
    /**
     * 格式化错误码时所需参数列表
     */
    protected String[] params;


    /**
     * 获取错误消息内容
     * 根据errCode从redis内获取未被格式化的错误消息内容
     * 并通过String.format()方法格式化错误消息以及参数
     *
     * @return
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * 获取错误码
     *
     * @return
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * 获取异常参数列表
     *
     * @return
     */
    public String[] getParams() {
        return params;
    }

    /**
     * 构造函数设置错误码以及错误参数列表
     *
     * @param errCode 错误码
     * @param params  错误参数列表
     */
    public LogicException(String errCode, String... params) {
        this.errCode = errCode;
        this.params = params;
        //获取格式化后的异常消息内容
        this.errMsg = ErrorMessageTools.getErrorMessage(errCode, params);
        //错误信息
        logger.error("系统遇到如下异常，异常码：{}>>>异常信息：{}", errCode, errMsg);
    }
}
