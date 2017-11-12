package com.hengyu.chapter39.timers;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * 商品添加定时任务实现类
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/11/5
 * Time：14:47
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 * @author 恒宇少年
 */
public class GoodAddTimer
    extends QuartzJobBean
{
    /**
     * logback
     */
    static Logger logger = LoggerFactory.getLogger(GoodAddTimer.class);
    /**
     * 定时任务逻辑实现方法
     * 每当触发器触发时会执行该方法逻辑
     * @param jobExecutionContext 任务执行上下文
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("分布式节点quartz-cluster-node-second，商品添加完成后执行任务，任务时间：{}",new Date());
    }
}
