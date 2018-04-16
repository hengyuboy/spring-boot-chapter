package com.hengyu.chapter51;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 客户数据接口
 * 继承自MongoRepository接口
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/28
 * Time：下午7:41
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
