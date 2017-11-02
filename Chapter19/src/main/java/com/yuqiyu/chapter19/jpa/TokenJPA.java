package com.yuqiyu.chapter19.jpa;

import com.yuqiyu.chapter19.entity.TokenInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/22
 * Time：22:37
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface TokenJPA extends JpaRepository<TokenInfoEntity,String>,
        JpaSpecificationExecutor<TokenInfoEntity> {
}
