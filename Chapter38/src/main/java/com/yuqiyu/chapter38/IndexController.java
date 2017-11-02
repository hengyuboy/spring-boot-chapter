package com.yuqiyu.chapter38;

import com.yuqiyu.chapter38.entity.SystemUserInfoEntity;
import com.yuqiyu.chapter38.jpa.SystemUserInfoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试profile环境
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/10/29
 * Time：09:02
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 * @author hengyu
 */
@RestController
@RequestMapping(value = "/user")
public class IndexController
{
    @Autowired
    private SystemUserInfoJPA systemUserInfoJPA;

    /**
     * 查询用户详情
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}")
    public SystemUserInfoEntity detail(@PathVariable("id") Integer id)
        throws Exception
    {
        return systemUserInfoJPA.findOne(id);
    }
}
