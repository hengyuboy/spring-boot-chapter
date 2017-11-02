package com.yuqiyu.chapter30.controller;

import com.yuqiyu.chapter30.bean.GoodInfoBean;
import com.yuqiyu.chapter30.bean.GoodTypeBean;
import com.yuqiyu.chapter30.dto.GoodInfoDTO;
import com.yuqiyu.chapter30.jpa.GoodInfoJPA;
import com.yuqiyu.chapter30.jpa.GoodTypeJPA;
import com.yuqiyu.chapter30.mapper.GoodInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/8/20
 * Time：12:24
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class GoodInfoController
{
    /**
     * 注入商品基本信息jpa
     */
    @Autowired
    private GoodInfoJPA goodInfoJPA;
    /**
     * 注入商品类型jpa
     */
    @Autowired
    private GoodTypeJPA goodTypeJPA;
    /**
     * 注入mapStruct转换Mapper
     */
    @Autowired
    private GoodInfoMapper goodInfoMapper;

    /**
     * 查询商品详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/detail/{id}")
    public GoodInfoDTO detail(@PathVariable("id") Long id)
    {
        //查询商品基本信息
        GoodInfoBean goodInfoBean = goodInfoJPA.findOne(id);
        //查询商品类型基本信息
        GoodTypeBean typeBean = goodTypeJPA.findOne(goodInfoBean.getTypeId());
        //返回转换dto
        return goodInfoMapper.from(goodInfoBean,typeBean);
    }
}
