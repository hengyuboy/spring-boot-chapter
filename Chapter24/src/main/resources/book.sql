/*
Navicat MariaDB Data Transfer

Source Server         : local
Source Server Version : 100108
Source Host           : localhost:3306
Source Database       : books

Target Server Type    : MariaDB
Target Server Version : 100108
File Encoding         : 65001

Date: 2017-05-30 17:13:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'SpringBoot实战');
INSERT INTO `book` VALUES ('2', 'SpringData实战');
