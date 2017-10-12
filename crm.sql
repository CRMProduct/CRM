/*
MySQL Data Transfer
Source Host: localhost
Source Database: crm
Target Host: localhost
Target Database: crm
Date: 2017/10/12 14:48:43
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for crmdepartment
-- ----------------------------
DROP TABLE IF EXISTS `crmdepartment`;
CREATE TABLE `crmdepartment` (
  `depId` int(11) NOT NULL AUTO_INCREMENT,
  `depName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`depId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmpost
-- ----------------------------
DROP TABLE IF EXISTS `crmpost`;
CREATE TABLE `crmpost` (
  `postId` int(11) NOT NULL AUTO_INCREMENT,
  `postName` varchar(100) DEFAULT NULL,
  `depId` int(11) DEFAULT NULL,
  PRIMARY KEY (`postId`),
  KEY `depId` (`depId`),
  CONSTRAINT `crmpost_ibfk_1` FOREIGN KEY (`depId`) REFERENCES `crmdepartment` (`depId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmstaff
-- ----------------------------
DROP TABLE IF EXISTS `crmstaff`;
CREATE TABLE `crmstaff` (
  `staffId` int(11) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(100) DEFAULT NULL,
  `loginPwd` varchar(100) DEFAULT NULL,
  `staffName` varchar(100) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `onDutyDate` char(10) DEFAULT NULL,
  `postId` int(11) DEFAULT NULL,
  PRIMARY KEY (`staffId`),
  KEY `postId` (`postId`),
  CONSTRAINT `crmstaff_ibfk_1` FOREIGN KEY (`postId`) REFERENCES `crmpost` (`postId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `crmdepartment` VALUES ('1', 'java学院');
INSERT INTO `crmdepartment` VALUES ('2', '咨询部');
INSERT INTO `crmpost` VALUES ('1', '总监', '1');
INSERT INTO `crmpost` VALUES ('2', '讲师', '1');
INSERT INTO `crmpost` VALUES ('3', '咨询部', '2');
INSERT INTO `crmstaff` VALUES ('1', 'gjn', '1111', '葛京能', '男', '2017/10/12', '1');
INSERT INTO `crmstaff` VALUES ('2', 'wzl', '1111', '吴兆龙', '男', '2017/10/12', '1');
INSERT INTO `crmstaff` VALUES ('3', 'wd', '1111', '吴东', '男', '2017/10/12', '2');
INSERT INTO `crmstaff` VALUES ('4', 'jy', '1111', '景阳', '女', '2017/10/12', '3');
