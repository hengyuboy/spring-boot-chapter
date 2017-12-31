package com.hengyu.chapter44.resource.repository;

import com.hengyu.chapter44.resource.entity.CommonResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 资源数据接口
 * @author yuqiyu
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/12/31
 * Time：上午11:31
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface CommonResourceRepository
    extends JpaRepository<CommonResourceEntity,Integer>
{
    /**
     * 根据类型编号 & 目标编号查询出资源实体
     * @param typeId 类型编号
     * @param targetId 目标编号
     * @return
     */
    List<CommonResourceEntity> findByTypeIdAndTargetId(String typeId, String targetId);
}
