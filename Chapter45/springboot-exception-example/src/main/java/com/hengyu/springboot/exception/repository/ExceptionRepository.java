package com.hengyu.springboot.exception.repository;

import com.hengyu.springboot.exception.entity.ExceptionInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 异常数据接口定义
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2018/1/7
 * Time：下午3:34
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 * @author yuqiyu
 */
public interface ExceptionRepository
    extends JpaRepository<ExceptionInfoEntity,Integer>
{
    /**
     * 根据异常码获取异常配置信息
     * @param code 异常码
     * @return
     */
    ExceptionInfoEntity findTopByCode(String code);
}
