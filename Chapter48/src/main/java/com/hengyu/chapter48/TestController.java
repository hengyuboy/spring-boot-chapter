package com.hengyu.chapter48;

import com.hengyu.chapter48.entity.MessageEntity;
import com.hengyu.chapter48.provider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/11
 * Time：下午5:43
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@RestController
public class TestController {
    /**
     * 消息队列 - 消息提供者 注入
     */
    @Autowired
    private MessageProvider messageProvider;

    /**
     * 测试发送消息队列方法
     *
     * @param messageEntity 发送消息实体内容
     * @return
     */
    @RequestMapping(value = "/index")
    public String index(MessageEntity messageEntity) {
        // 将实体实例写入消息队列
        messageProvider.sendMessage(messageEntity);
        return "Success";
    }
}
