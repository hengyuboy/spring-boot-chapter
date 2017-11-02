package com.yuqiyu.chapter12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/13
 * Time：20:53
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class TestController {
    //logback
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    /**
     * 访问首页
     * @return
     */
    @RequestMapping(value = "/test")
    public String index()
    {
        logger.debug("Test -> 记录debug日志");
        logger.info("Test -> 访问了index方法");
        logger.error("Test -> 记录error错误日志");
        return "test";
    }
}
