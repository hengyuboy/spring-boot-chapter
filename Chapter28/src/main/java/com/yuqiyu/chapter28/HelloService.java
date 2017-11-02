package com.yuqiyu.chapter28;

/**
 * 自定义业务实现
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/22
 * Time：22:54
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public class HelloService
{
    //消息内容
    private String msg;
    //是否显示消息内容
    private boolean show = true;

    public String sayHello()
    {
        return show ? "Hello，" + msg : "Hidden";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
