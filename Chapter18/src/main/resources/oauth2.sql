/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : oauth2

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-04-22 17:58:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for authority
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('ROLE_ADMIN');
INSERT INTO `authority` VALUES ('ROLE_USER');

-- ----------------------------
-- Table structure for oauth_access_token
-- ----------------------------
DROP TABLE IF EXISTS `oauth_access_token`;
CREATE TABLE `oauth_access_token` (
  `token_id` varchar(256) DEFAULT NULL,
  `token` blob,
  `authentication_id` varchar(256) DEFAULT NULL,
  `user_name` varchar(256) DEFAULT NULL,
  `client_id` varchar(256) DEFAULT NULL,
  `authentication` blob,
  `refresh_token` varchar(256) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oauth_access_token
-- ----------------------------

-- ----------------------------
-- Table structure for oauth_refresh_token
-- ----------------------------
DROP TABLE IF EXISTS `oauth_refresh_token`;
CREATE TABLE `oauth_refresh_token` (
  `token_id` varchar(256) DEFAULT NULL,
  `token` blob,
  `authentication` blob
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oauth_refresh_token
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(500) DEFAULT NULL,
  `activated` tinyint(1) DEFAULT '0',
  `activationkey` varchar(50) DEFAULT NULL,
  `resetpasswordkey` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', 'admin@mail.me', 'b8f57d6d6ec0a60dfe2e20182d4615b12e321cad9e2979e0b9f81e0d6eda78ad9b6dcfe53e4e22d1', '1', null, null);
INSERT INTO `user` VALUES ('user', 'user@mail.me', 'd6dfa9ff45e03b161e7f680f35d90d5ef51d243c2a8285aa7e11247bc2c92acde0c2bb626b1fac74', '1', null, null);
INSERT INTO `user` VALUES ('rajith', 'rajith@abc.com', 'd6dfa9ff45e03b161e7f680f35d90d5ef51d243c2a8285aa7e11247bc2c92acde0c2bb626b1fac74', '1', null, null);

-- ----------------------------
-- Table structure for user_authority
-- ----------------------------
DROP TABLE IF EXISTS `user_authority`;
CREATE TABLE `user_authority` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `user_authority_idx_1` (`username`,`authority`),
  KEY `authority` (`authority`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_authority
-- ----------------------------
INSERT INTO `user_authority` VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO `user_authority` VALUES ('admin', 'ROLE_USER');
INSERT INTO `user_authority` VALUES ('rajith', 'ROLE_USER');
INSERT INTO `user_authority` VALUES ('user', 'ROLE_USER');
