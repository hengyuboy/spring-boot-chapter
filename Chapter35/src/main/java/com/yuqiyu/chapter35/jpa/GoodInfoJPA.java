package com.yuqiyu.chapter35.jpa;

import com.yuqiyu.chapter35.bean.GoodInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 商品jpa
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/9/13
 * Time：22:23
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface GoodInfoJPA
    extends JpaRepository<GoodInfoEntity,Integer>
{
}
