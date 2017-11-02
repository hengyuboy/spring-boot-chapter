package com.yuqiyu.chapter16.service;

import com.yuqiyu.chapter16.entity.UserEntity;
import com.yuqiyu.chapter16.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/17
 * Time：22:43
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserService {

    @Autowired
    private UserJPA userJPA;

    @Cacheable
    public List<UserEntity> list()
    {
        return userJPA.findAll();
    }
}
