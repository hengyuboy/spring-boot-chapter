package com.yuqiyu;

import org.springframework.web.bind.annotation.*;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/29
 * Time：10:38
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class RestExceptionHandler
{
    /**
     * 默认统一异常处理方法
     * @param e 默认Exception异常对象
     * @return
     */
    @ExceptionHandler
    @ResponseStatus
    public ApiResult runtimeExceptionHandler(Exception e) {
        return ApiResultGenerator.errorResult(e.getMessage(),e);
    }
}
