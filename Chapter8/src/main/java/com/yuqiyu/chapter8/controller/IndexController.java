package com.yuqiyu.chapter8.controller;

import com.alibaba.fastjson.JSONObject;
import com.yuqiyu.chapter8.util.LoggerUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/10
 * Time：21:46
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {
    /**
     * 简单测试请求日志的记录
     * @param request 请求对象
     * @param name 用户名
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JSONObject login(HttpServletRequest request,String name) throws Exception
    {
        JSONObject obj = new JSONObject();
        obj.put("msg","用户："+name+"，登录成功。");
        //将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN,obj);
        return obj;
    }
}
