package com.yuqiyu;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 项目名称：credirCardApi
 * 项目版本：V1.0
 * 包名称：com.xunmei.core.api
 * 创建人：yuqy
 * 创建时间：2017/3/17 16:39
 * 修改人：yuqy
 * 修改时间：2017/3/17 16:39
 * 修改备注：
 */
public final class ApiResultGenerator
{
    /**
     * 创建普通消息方法
     * @param flag 执行接口状态，true:执行成功,false:执行失败
     * @param msg 返回消息内容
     * @param result 返回结果
     * @param jumpUrl 跳转路径
     * @return
     */
    public static ApiResult result(boolean flag, String msg, Object result, String jumpUrl, int rows, Throwable throwable)
    {
        //创建返回对象
        ApiResult apiResult = ApiResult.newInstance();
        apiResult.setFlag(flag);
        apiResult.setMsg(msg == "" ? "执行成功" : msg);
        apiResult.setResult(result);
        apiResult.setJumpUrl(jumpUrl);
        apiResult.setTime(System.currentTimeMillis());
        apiResult.setRows(rows);
        return apiResult;
    }

    /**
     * 返回执行成功视图方法
     * @param result 执行成功后的返回内容
     * @return
     */
    public static ApiResult successResult(Object result)
    {
        //rows默认为0
        int rows = 0;
        //如果是集合
        if(result instanceof List)
        {
            //获取总数量
            rows = ((List)result).size();
        }
        return result(true,"",result,"",rows,null);
    }

    /**
     * 成功没有内容方法
     * @return
     */
    public static ApiResult successResult(HttpServletRequest request){
        return successResult("");
    }

    /**
     * 执行失败后返回视图方法
     * @param msg 执行失败后的错误消息内容
     * @return
     */
    public static ApiResult errorResult(String msg, Throwable throwable)
    {
        return result(false,msg,"","",0,throwable);
    }
}
