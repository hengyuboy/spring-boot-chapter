package com.yuqiyu.chapter19.jpa;

import com.yuqiyu.chapter19.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 请求用户信息数据接口
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/22
 * Time：22:36
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface UserInfoJPA extends JpaRepository<UserInfoEntity,String>,
        JpaSpecificationExecutor<UserInfoEntity>
{

}
