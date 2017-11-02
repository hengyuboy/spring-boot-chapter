package com.yuqiyu.chapter17.service;

import com.yuqiyu.chapter17.UserJPA;
import com.yuqiyu.chapter17.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/18
 * Time：22:40
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class UserService implements UserDetailsService
{
    @Autowired
    UserJPA userJPA;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userJPA.findByUsername(username);
        if(user == null)
        {
            throw new UsernameNotFoundException("未查询到用户："+username+"信息！");
        }
        return user;
    }
}
