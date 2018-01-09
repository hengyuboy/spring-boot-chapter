package com.hengyu.chapter44.controller;

import com.hengyu.chapter44.entity.UserDetailDTO;
import com.hengyu.chapter44.entity.UserInfoEntity;
import com.hengyu.chapter44.jpa.UserInfoRepository;
import com.hengyu.chapter44.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：下午3:09
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping(value = "/user")
public class UserInfoController
{
    /**
     * 用户基本信息业务逻辑实现
     */
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 根据用户名查询详情
     * @param userName 用户名
     * @return
     */
    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public UserDetailDTO detail(@PathVariable("userName") String userName)
    {
        return userInfoService.selectByUserName(userName);
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/all")
    public List<UserInfoEntity> all()
    {
        return userInfoRepository.findAll();
    }
}
