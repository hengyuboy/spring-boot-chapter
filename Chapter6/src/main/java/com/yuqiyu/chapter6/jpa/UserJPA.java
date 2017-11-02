package com.yuqiyu.chapter6.jpa;

import com.yuqiyu.chapter6.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/4
 * Time：15:43
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface UserJPA extends
        JpaRepository<UserEntity, Long>,
        JpaSpecificationExecutor<UserEntity>,
        Serializable{
}
