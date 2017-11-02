package com.yuqiyu.chapter14.controller;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import com.yuqiyu.chapter14.Inquirer;
import com.yuqiyu.chapter14.entity.GoodEntity;
import com.yuqiyu.chapter14.entity.QGoodEntity;
import com.yuqiyu.chapter14.jpa.GoodJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/15
 * Time：15:02
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class QueryController
{
    @Autowired
    private GoodJPA goodJPA;

    //注入EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    @RequestMapping(value = "/query")
    public List<GoodEntity> list()
    {
        //querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;
        //构建JPA查询对象
        JPAQuery<GoodEntity> jpaQuery = new JPAQuery<>(entityManager);
        //返回查询接口
        return jpaQuery
                //查询字段
                .select(_good)
                //查询表
                .from(_good)
                //查询条件
                .where(_good.type.id.eq(Long.valueOf("1")))
                //返回结果
                .fetch();
    }

    /**
     * spring data jpa 整合querydsl完成查询
     * @return
     */
    @RequestMapping(value = "/join")
    public List<GoodEntity> join()
    {
        //querydsl查询实体
        QGoodEntity _good = QGoodEntity.goodEntity;
        //自定义查询对象
        Inquirer inquirer = new Inquirer();
        //添加查询条件
        inquirer.putExpression(_good.type.id.eq(Long.valueOf("1")));
        //返回查询结果
        return inquirer.iteratorToList(goodJPA.findAll(inquirer.buidleQuery()));
    }
}
