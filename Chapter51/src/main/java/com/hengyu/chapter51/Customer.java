package com.hengyu.chapter51;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * 客户实体类
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/28
 * Time：下午7:40
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Data
public class Customer implements Serializable {
    /**
     * 客户编号
     */
    @Id
    public String id;
    /**
     * 客户名称
     */
    public String firstName;
    /**
     * 客户姓氏
     */
    public String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
