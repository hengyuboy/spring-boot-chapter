package com.yuqiyu.chapter24.book.bean;

import javax.persistence.*;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/5/30
 * Time：14:27
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "book")
public class BookBean {

    @Id
    @Column(name = "b_id")
    @GeneratedValue
    private Long id;

    @Column(name = "b_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
