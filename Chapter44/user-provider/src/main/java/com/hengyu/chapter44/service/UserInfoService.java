package com.hengyu.chapter44.service;

import com.hengyu.chapter44.entity.UserDetailDTO;
import com.hengyu.chapter44.entity.UserInfoEntity;
import com.hengyu.chapter44.jpa.UserInfoRepository;
import com.hengyu.chapter44.mapping.annotations.ResourceMethod;
import com.hengyu.chapter44.struct.UserMapStruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户基本信息业务逻辑实现
 *
 * @author yuqiyu
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：上午11:53
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserInfoService {
    /**
     * 用户数据接口
     */
    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * 更新用户名称查询用户详情
     * @param userName 用户名
     * @return 用户详情
     */
    @ResourceMethod
    public UserDetailDTO selectByUserName(String userName) {
        /**
         * 获取用户基本信息
         */
        UserInfoEntity userInfoEntity = userInfoRepository.findUserInfoEntityByUserName(userName);
        /**
         * 通过mapStruct转换detailDto
         */
        UserDetailDTO detailDTO = UserMapStruct.INSTANCE.fromUserEntity(userInfoEntity);
        /**
         * 返回数据
         */
        return detailDTO;
    }
}
