package com.yuqiyu.chapter13.controller;

import com.yuqiyu.chapter13.entity.UserEntity;
import com.yuqiyu.chapter13.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/14
 * Time：23:32
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class UserController{

    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/list")
    public List<UserEntity> list()
    {
        return userJPA.findAll();
    }

    @RequestMapping(value = "/add")
    public String add()
    {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("测试");
        userEntity.setAddress("测试地址");
        userEntity.setAge(21);
        userJPA.save(userEntity);
        return "用户信息添加成功";
    }

    @RequestMapping(value = "/delete")
    public String delete(Long userId)
    {
        userJPA.delete(userId);
        return "用户信息删除成功";
    }

    @RequestMapping(value = "/age")
    public List<UserEntity> age(){
        return userJPA.nativeQuery(20);
    }

    /**
     * 根据条件自定义编写删除SQL
     * @return
     */
    @RequestMapping(value = "/deleteWhere")
    public String deleteWhere()
    {
        userJPA.deleteQuery("admin","123456");
        return "自定义SQL删除数据成功";
    }

    /**
     * 分页查询测试
     * @param page 传入页码，从1开始
     * @return
     */
    @RequestMapping(value = "/cutpage")
    public List<UserEntity> cutPage(int page)
    {
        UserEntity user = new UserEntity();
        user.setSize(2);
        user.setSord("desc");
        user.setPage(page);

        //获取排序对象
        Sort.Direction sort_direction = Sort.Direction.ASC.toString().equalsIgnoreCase(user.getSord()) ? Sort.Direction.ASC : Sort.Direction.DESC;
        //设置排序对象参数
        Sort sort = new Sort(sort_direction, user.getSidx());
        //创建分页对象
        PageRequest pageRequest = new PageRequest(user.getPage() - 1,user.getSize(),sort);
        //执行分页查询
        return userJPA.findAll(pageRequest).getContent();
    }
}
