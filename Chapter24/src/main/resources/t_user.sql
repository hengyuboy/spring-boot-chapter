/*
Navicat MariaDB Data Transfer

Source Server         : local
Source Server Version : 100108
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MariaDB
Target Server Version : 100108
File Encoding         : 65001

Date: 2017-05-30 17:13:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `t_name` varchar(30) DEFAULT NULL COMMENT '名称',
  `t_age` int(10) DEFAULT NULL COMMENT '年龄',
  `t_address` varchar(100) DEFAULT NULL COMMENT '家庭住址',
  `t_pwd` varchar(100) CHARACTER SET latin1 DEFAULT NULL COMMENT '用户登录密码',
  PRIMARY KEY (`t_id`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('6', 'ada', '2', 'ad', 'ada');
INSERT INTO `t_user` VALUES ('7', 'lajhldh', '77', 'adhl', 'adhla');
INSERT INTO `t_user` VALUES ('8', 'ad8', '7', 'adk', '666gbka');
INSERT INTO `t_user` VALUES ('9', 'akd==', '8', 'aohoo', '5');
