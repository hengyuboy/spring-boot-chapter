package com.hengyu.chapter39.timers;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * 商品库存检查定时任务
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/5
 * Time：15:47
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class GoodStockCheckTimer
        extends QuartzJobBean {
    /**
     * logback
     */
    static Logger logger = LoggerFactory.getLogger(GoodStockCheckTimer.class);

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("分布式节点quartz-cluster-node-second，执行库存检查定时任务，执行时间：{}", new Date());
    }
}
