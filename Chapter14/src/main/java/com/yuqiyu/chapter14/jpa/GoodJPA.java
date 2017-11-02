package com.yuqiyu.chapter14.jpa;

import com.yuqiyu.chapter14.entity.GoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/15
 * Time：15:10
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface GoodJPA
        extends
        JpaRepository<GoodEntity,Long>,
        QueryDslPredicateExecutor<GoodEntity>
{

}
