package com.yuqiyu.chapter13.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/15
 * Time：9:40
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@NoRepositoryBean
public interface BaseRepository<T,PK extends Serializable> extends JpaRepository<T,PK>
{
}
