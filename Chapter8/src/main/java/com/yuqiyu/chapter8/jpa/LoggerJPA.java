package com.yuqiyu.chapter8.jpa;

import com.yuqiyu.chapter8.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 请求日志数据接口
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/10
 * Time：21:06
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface LoggerJPA
        extends JpaRepository<LoggerEntity,Long>
{

}
