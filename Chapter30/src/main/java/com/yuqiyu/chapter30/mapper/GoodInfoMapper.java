package com.yuqiyu.chapter30.mapper;

import com.yuqiyu.chapter30.bean.GoodInfoBean;
import com.yuqiyu.chapter30.bean.GoodTypeBean;
import com.yuqiyu.chapter30.dto.GoodInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * 配置映射
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/8/20
 * Time：11:26
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Mapper(componentModel = "spring")
//@Mapper
public interface GoodInfoMapper
{
    //public static GoodInfoMapper MAPPER = Mappers.getMapper(GoodInfoMapper.class);

    @Mappings({
            @Mapping(source = "type.name",target = "typeName"),
            @Mapping(source = "good.id",target = "goodId"),
            @Mapping(source = "good.title",target = "goodName"),
            @Mapping(source = "good.price",target = "goodPrice")
    })
    public GoodInfoDTO from(GoodInfoBean good, GoodTypeBean type);
}
