package com.yuqiyu.chapter38.jpa;

import com.yuqiyu.chapter38.entity.SystemUserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 系统用户信息jpa
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/10/29
 * Time：08:30
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface SystemUserInfoJPA
    extends JpaRepository<SystemUserInfoEntity,Integer>
{

}
