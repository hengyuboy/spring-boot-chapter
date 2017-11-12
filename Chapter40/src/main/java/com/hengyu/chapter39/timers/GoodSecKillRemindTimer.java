package com.hengyu.chapter39.timers;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 商品秒杀提醒定时器
 * 为关注该秒杀商品的用户进行推送提醒
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/12
 * Time：9:23
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class GoodSecKillRemindTimer
extends QuartzJobBean
{
    /**
     * logback
     */
    private Logger logger = LoggerFactory.getLogger(GoodSecKillRemindTimer.class);

    /**
     * 任务指定逻辑
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //获取任务详情内的数据集合
        JobDataMap dataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        //获取商品编号
        Long goodId = dataMap.getLong("goodId");
        logger.info("分布式节点quartz-cluster-node-second，开始处理秒杀商品：{}，关注用户推送消息.",goodId);
    }
}
