package com.hengyu.chapter44.resource.repository;

import com.hengyu.chapter44.resource.entity.CommonResourceTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 资源类型数据接口
 * @author yuqiyu
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：上午11:32
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface CommonResourceTypeRepository
    extends JpaRepository<CommonResourceTypeEntity,String>
{
    /**
     * 根据类别标识查询
     * @param flag 资源类型标识
     * @return
     */
    CommonResourceTypeEntity findTopByFlag(String flag);
}
