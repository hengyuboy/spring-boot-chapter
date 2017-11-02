package com.yuqiyu.chapter22.controller;

import com.yuqiyu.chapter22.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/5/4
 * Time：22:23
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user/index")
    public String index(HttpServletRequest request, UserBean user)
    {
        //将name属性传入到user_index.jsp页面中展示
        request.setAttribute("name",user.getName());
        //跳转user_index.jsp页面
        return "user_index";
    }
}
