package com.hengyu.chapter52;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

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
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends MongoRepository<Customer, String> {
    /**
     * 更加名字查询数据
     *
     * @param firstName 名字
     * @return
     */
    List<Customer> findByFirstName(@Param("firstName") String firstName);

    /**
     * 根据姓氏查询出最靠前的一条数据
     *
     * @param lastName 姓氏
     * @return
     */
    Customer findTopByLastName(@Param("lastName") String lastName);
}
