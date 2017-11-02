package com.yuqiyu.chapter8.util;

import javax.servlet.http.HttpServletRequest;

/**
 * 项目名称：HengYuLogger
 * 项目版本：V1.0
 * 包名称：com.hengyu.logger
 * 创建人：yuqy
 * 创建时间：2017/3/29 18:24
 * 修改人：yuqy
 * 修改时间：2017/3/29 18:24
 * 修改备注：
 */
public final class LoggerUtils {

    public static final String LOGGER_RETURN = "_logger_return";

    private LoggerUtils() {}

    /**
     * 获取客户端ip地址
     * @param request
     * @return
     */
    public static String getCliectIp(HttpServletRequest request)
    {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.trim() == "" || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.trim() == "" || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.trim() == "" || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }

        // 多个路由时，取第一个非unknown的ip
        final String[] arr = ip.split(",");
        for (final String str : arr) {
            if (!"unknown".equalsIgnoreCase(str)) {
                ip = str;
                break;
            }
        }
        return ip;
    }

    /**
     * 判断是否为ajax请求
     * @param request
     * @return
     */
    public static String getRequestType(HttpServletRequest request) {
        return request.getHeader("X-Requested-With");
    }
}
