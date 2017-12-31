package com.hengyu.chapter44.entity;

import com.hengyu.chapter44.mapping.annotations.ResourceField;
import com.hengyu.chapter44.mapping.enums.CommonResourceFlag;
import lombok.Data;

import java.util.List;

/**
 * 用户详情dto映射实体
 * @author yuqiyu
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：上午11:54
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Data
public class UserDetailDTO
    extends UserInfoEntity
{
    /**
     * 用户头像
     */
    @ResourceField(flag = CommonResourceFlag.USER_HEAD_IMAGE)
    private String headImage;
    /**
     * 背景图片
     */
    @ResourceField(flag = CommonResourceFlag.USER_BACK_IMAGE,multiple = true)
    private List<String> backImage;
}
