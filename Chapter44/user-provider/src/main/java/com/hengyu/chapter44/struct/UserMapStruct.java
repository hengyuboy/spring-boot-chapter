package com.hengyu.chapter44.struct;

import com.hengyu.chapter44.entity.UserDetailDTO;
import com.hengyu.chapter44.entity.UserInfoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 用户基本信息mapStruct
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：下午3:20
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Mapper
public interface UserMapStruct {
    /**
     * get new instance
     */
    public static UserMapStruct INSTANCE = Mappers.getMapper(UserMapStruct.class);

    /**
     * 从用户基本实体转换userDetailDto实例
     * @param user 用户基本实体
     * @return
     */
    @Mapping(source = "user.userId",target = "userId")
    public UserDetailDTO fromUserEntity(UserInfoEntity user);
}
