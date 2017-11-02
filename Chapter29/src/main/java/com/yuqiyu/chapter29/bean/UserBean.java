package com.yuqiyu.chapter29.bean;

import lombok.*;

/**
 * 用户实体>>>测试lombok
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/8/4
 * Time：23:07
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
/*@Getter
@Setter
@ToString*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBean
{
    //名称
    private String name;
    //年龄
    private int age;
    //家庭住址
    private String address;

    public String getAddress() {
        return "sss"+address;
    }
}
