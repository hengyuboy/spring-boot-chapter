package com.yuqiyu.chapter36.controller;

import com.alibaba.fastjson.JSON;
import com.yuqiyu.chapter36.annotation.ParameterModel;
import com.yuqiyu.chapter36.bean.StudentEntity;
import com.yuqiyu.chapter36.bean.TeacherEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 表单提交控制器
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/9/16
 * Time：22:26
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class IndexController
{
    /**
     * 装载参数测试
     * 1、不添加ParameterModel注解时查看结果
     * 2、添加ParameterModel注解时查看结果
     * @return
     */
    @RequestMapping(value = "/submit")
    public String resolver(@ParameterModel TeacherEntity teacher, @ParameterModel StudentEntity student)
    {
        return "教师名称："+ JSON.toJSON(teacher.getName()) +"，学生名称："+student.getName()+"，学生年龄："+student.getAge();
    }
}
