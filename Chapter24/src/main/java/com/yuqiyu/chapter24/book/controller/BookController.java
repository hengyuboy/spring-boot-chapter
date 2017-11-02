package com.yuqiyu.chapter24.book.controller;

import com.yuqiyu.chapter24.book.bean.BookBean;
import com.yuqiyu.chapter24.book.jpa.BookJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/5/30
 * Time：14:29
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    private BookJPA bookJPA;

    /**
     * 查询书籍列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<BookBean> list(){
        return bookJPA.findAll();
    }
}
