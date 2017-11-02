package com.yuqiyu.chapter35.controller;

import com.yuqiyu.chapter35.bean.GoodInfoEntity;
import com.yuqiyu.chapter35.jpa.GoodInfoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ===============================
 * Created with Eclipse.
 * User：于起宇
 * Date：2017/9/13
 * Time：18:37
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@RestController
public class TestController
{
    //商品基本信息数据接口
    @Autowired
    private GoodInfoJPA goodInfoJPA;

    /**
     * 查询首页内容
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(String name)
    {
        return "this is index page" + name;
    }

    /**
     * 查询全部商品
     * @return
     */
    @RequestMapping(value = "/all")
    public List<GoodInfoEntity> selectAll()
    {
        return goodInfoJPA.findAll();
    }

    /**
     * 查询商品详情
     * @param goodId
     * @return
     */
    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public GoodInfoEntity selectOne(Integer goodId)
    {
        return goodInfoJPA.findOne(goodId);
    }
}
