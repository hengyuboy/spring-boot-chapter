package com.hengyu.chapter44.jpa;

import com.hengyu.chapter44.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户基本信息数据接口
 * @author yuqiyu
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：上午11:30
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface UserInfoRepository
    extends JpaRepository<UserInfoEntity,String>
{
    /**
     * 根据用户名称查询
     * @param userName
     * @return
     */
    UserInfoEntity findUserInfoEntityByUserName(String userName);
}
