package com.hengyu.chapter44.mapping.aspect;

import com.hengyu.chapter44.mapping.annotations.ResourceMethod;
import com.hengyu.chapter44.mapping.service.ResourcePushService;
import com.hengyu.chapter44.resource.entity.BaseEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 统一资源Aop切面定义
 * 根据自定义注解配置自动设置配置的资源类型到指定的字段
 * @author：于起宇 <br/>
 * ===============================
 * Created with Eclipse.
 * Date：2017/12/15
 * Time：14:05
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Component
@Aspect
public class ResourceAspect
{
    /**
     * logback
     */
    Logger logger = LoggerFactory.getLogger(ResourceAspect.class);

    /**
     * 资源处理业务逻辑
     */
    @Autowired
    @Qualifier("ResourcePushSupport")
    ResourcePushService resourcePushService;

    /**
     * 资源设置切面方法
     * 拦截配置了@ResourceMethod注解的class method，cglib仅支持class 方法切面，接口切面不支持
     * @param proceedingJoinPoint 切面方法实例
     * @param resourceMethod 方法注解实例
     * @return
     * @throws Throwable
     */
    @Around(value = "@annotation(resourceMethod)")
    public Object resourcePutAround(ProceedingJoinPoint proceedingJoinPoint, ResourceMethod resourceMethod)
        throws Throwable
    {
        logger.info("开始处理资源自动设置Aop切面逻辑");
        /**
         * 执行方法，获取返回值
         */
        Object result = proceedingJoinPoint.proceed();
        if(StringUtils.isEmpty(result)) {return result;}
        /**
         * 返回值为List集合时
         */
        if(result instanceof List) {
            List<Object> list = (List<Object>) result;
            resourcePushService.push(list);
        }
        /**
         * 返回值为单值时，返回的实例类型必须继承BaseEntity
         */
        else if(result instanceof BaseEntity) {
            resourcePushService.push(result);
        }
        logger.info("资源自动设置Aop切面逻辑处理完成.");
        return result;
    }
}
