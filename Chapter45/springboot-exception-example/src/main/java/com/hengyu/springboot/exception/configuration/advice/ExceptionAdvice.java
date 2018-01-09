package com.hengyu.springboot.exception.configuration.advice;

import com.hengyu.springboot.exception.common.ApiResponseEntity;
import com.hengyu.springboot.exception.core.LogicException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * 控制器异常通知类
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2018/1/7
 * Time：下午5:30
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 *
 * @author yuqiyu
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class ExceptionAdvice {

    /**
     * logback new instance
     */
    Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 处理业务逻辑异常
     *
     * @param e 业务逻辑异常对象实例
     * @return 逻辑异常消息内容
     */
    @ExceptionHandler(LogicException.class)
    @ResponseStatus(code = HttpStatus.OK)
    public ApiResponseEntity<String> logicException(LogicException e) {
        logger.error("遇到业务逻辑异常：【{}】", e.getErrCode());
        // 返回响应实体内容
        return ApiResponseEntity.<String>builder().errorMsg(e.getErrMsg()).build();
    }
}
