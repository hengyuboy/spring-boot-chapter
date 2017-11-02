package com.yuqiyu.chapter16.jpa;

import com.yuqiyu.chapter16.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/14
 * Time：23:08
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface UserJPA extends JpaRepository<UserEntity,Long>
{

}
