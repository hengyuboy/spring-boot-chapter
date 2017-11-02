package com.yuqiyu.chapter24.base.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * 该接口继承自JpaRepository<T, Long>,如需自定义CRUD函数，可自己在继承该接口的子接口内实现<br>
 * 如：<br>
 * @Query("from User u where u.name=:name")<br>
 * User findUser(@Param("name") String name);<br>
 * <br>
 * @param <T>
 */
public interface BaseDAO<T>
        extends
        JpaRepository<T, Long>,
        JpaSpecificationExecutor<T>,
            Serializable
{

}
