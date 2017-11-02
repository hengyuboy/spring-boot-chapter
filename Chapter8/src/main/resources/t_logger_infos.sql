/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-04-10 23:11:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_logger_infos
-- ----------------------------
DROP TABLE IF EXISTS `t_logger_infos`;
CREATE TABLE `t_logger_infos` (
  `ali_id` int(11) NOT NULL AUTO_INCREMENT,
  `ali_client_ip` varchar(30) DEFAULT NULL COMMENT '客户端请求IP地址',
  `ali_uri` varchar(100) DEFAULT NULL COMMENT '日志请求地址',
  `ali_type` varchar(50) DEFAULT NULL COMMENT '终端请求方式,普通请求,ajax请求',
  `ali_method` varchar(10) DEFAULT NULL COMMENT '请求方式method,post,get等',
  `ali_param_data` longtext COMMENT '请求参数内容,json',
  `ali_session_id` varchar(100) DEFAULT NULL COMMENT '请求接口唯一session标识',
  `ali_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '请求时间',
  `ali_returm_time` varchar(50) DEFAULT NULL COMMENT '接口返回时间',
  `ali_return_data` longtext COMMENT '接口返回数据json',
  `ali_http_status_code` varchar(10) DEFAULT NULL COMMENT '请求时httpStatusCode代码，如：200,400,404等',
  `ali_time_consuming` int(8) DEFAULT '0' COMMENT '请求耗时（毫秒单位）',
  PRIMARY KEY (`ali_id`)
) ENGINE=InnoDB AUTO_INCREMENT=106119 DEFAULT CHARSET=utf8 COMMENT='请求日志信息表';
