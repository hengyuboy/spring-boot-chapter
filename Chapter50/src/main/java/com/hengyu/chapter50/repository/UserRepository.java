package com.hengyu.chapter50.repository;

import com.hengyu.chapter50.entity.TestUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/4/15
 * Time：下午2:49
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
public interface UserRepository extends JpaRepository<TestUserEntity, Integer> {
}
