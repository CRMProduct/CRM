/*
MySQL Data Transfer
Source Host: localhost
Source Database: crmstaff
Target Host: localhost
Target Database: crmstaff
Date: 2017/10/16 20:10:02
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for crmclass
-- ----------------------------
DROP TABLE IF EXISTS `crmclass`;
CREATE TABLE `crmclass` (
  `classId` int(11) NOT NULL AUTO_INCREMENT,
  `className` varchar(50) DEFAULT NULL,
  `beginTime` char(20) DEFAULT NULL,
  `endTime` char(20) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `totalCount` int(11) DEFAULT NULL,
  `upgradeCount` int(11) DEFAULT NULL,
  `changeCount` int(11) DEFAULT NULL,
  `runoffCount` int(11) DEFAULT NULL,
  `remark` varchar(500) DEFAULT NULL,
  `uploadPath` varchar(200) DEFAULT NULL,
  `uploadFileName` varchar(20) DEFAULT NULL,
  `uploadTime` char(1) DEFAULT NULL,
  `courseTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`classId`),
  KEY `courseTypeID` (`courseTypeId`),
  CONSTRAINT `crmclass_ibfk_1` FOREIGN KEY (`courseTypeId`) REFERENCES `crmcoursetype` (`courseTypeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmcoursetype
-- ----------------------------
DROP TABLE IF EXISTS `crmcoursetype`;
CREATE TABLE `crmcoursetype` (
  `courseTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `courseCost` double DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `courseName` varchar(500) DEFAULT NULL,
  `remark` varchar(5000) DEFAULT NULL,
  PRIMARY KEY (`courseTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmdepartment
-- ----------------------------
DROP TABLE IF EXISTS `crmdepartment`;
CREATE TABLE `crmdepartment` (
  `depId` int(11) NOT NULL AUTO_INCREMENT,
  `depName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`depId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmfollow
-- ----------------------------
DROP TABLE IF EXISTS `crmfollow`;
CREATE TABLE `crmfollow` (
  `followId` int(11) NOT NULL AUTO_INCREMENT,
  `followTime` varchar(10) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `staffId` int(11) DEFAULT NULL,
  `referId` int(11) DEFAULT NULL,
  PRIMARY KEY (`followId`),
  KEY `referId` (`referId`),
  CONSTRAINT `crmfollow_ibfk_1` FOREIGN KEY (`referId`) REFERENCES `crmrefer` (`referId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmgraduate
-- ----------------------------
DROP TABLE IF EXISTS `crmgraduate`;
CREATE TABLE `crmgraduate` (
  `granduateId` int(11) NOT NULL AUTO_INCREMENT,
  `studentId` int(11) DEFAULT NULL,
  `companyName` varchar(100) DEFAULT NULL,
  `salary` varchar(50) DEFAULT NULL,
  `post` varchar(50) DEFAULT NULL,
  `entryTime` varchar(50) DEFAULT NULL,
  `remark` varchar(500) DEFAULT NULL,
  `classId` int(11) DEFAULT NULL,
  PRIMARY KEY (`granduateId`),
  KEY `classId` (`classId`),
  KEY `studentId` (`studentId`),
  CONSTRAINT `crmgraduate_ibfk_1` FOREIGN KEY (`classId`) REFERENCES `crmclass` (`classId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `crmgraduate_ibfk_2` FOREIGN KEY (`studentId`) REFERENCES `crmstudent` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmrefer
-- ----------------------------
DROP TABLE IF EXISTS `crmrefer`;
CREATE TABLE `crmrefer` (
  `referId` int(11) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `QQ` varchar(30) DEFAULT NULL,
  `createDate` varchar(10) DEFAULT NULL,
  `intentionLevel` varchar(50) DEFAULT NULL,
  `courseTypeId` int(11) DEFAULT NULL,
  `classId` int(11) DEFAULT NULL,
  `Source` varchar(50) DEFAULT NULL,
  `studentStatus` varchar(50) DEFAULT NULL,
  `Remark` varchar(50) DEFAULT NULL,
  `staffId` int(11) DEFAULT NULL,
  PRIMARY KEY (`referId`),
  KEY `courseTypeId` (`courseTypeId`),
  KEY `classId` (`classId`),
  CONSTRAINT `crmrefer_ibfk_1` FOREIGN KEY (`courseTypeId`) REFERENCES `crmcoursetype` (`courseTypeId`),
  CONSTRAINT `crmrefer_ibfk_2` FOREIGN KEY (`classId`) REFERENCES `crmclass` (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmrunoff
-- ----------------------------
DROP TABLE IF EXISTS `crmrunoff`;
CREATE TABLE `crmrunoff` (
  `runOffId` int(11) NOT NULL AUTO_INCREMENT,
  `studentId` int(11) DEFAULT NULL,
  `staffId` int(11) DEFAULT NULL,
  `createDate` varchar(50) DEFAULT NULL,
  `isRefund` varchar(20) DEFAULT NULL,
  `refundAmount` varchar(20) DEFAULT NULL,
  `remark` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`runOffId`),
  KEY `studentId` (`studentId`),
  CONSTRAINT `crmrunoff_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `crmstudent` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmstation
-- ----------------------------
DROP TABLE IF EXISTS `crmstation`;
CREATE TABLE `crmstation` (
  `stationId` int(11) NOT NULL AUTO_INCREMENT,
  `studentId` int(11) DEFAULT NULL,
  `flag` varchar(50) DEFAULT NULL,
  `staffId` int(11) DEFAULT NULL,
  `createDate` varchar(50) DEFAULT NULL,
  `beforeClassId` int(11) DEFAULT NULL,
  `afterClassId` int(11) DEFAULT NULL,
  PRIMARY KEY (`stationId`),
  KEY `studentId` (`studentId`),
  CONSTRAINT `crmstation_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `crmstudent` (`studentId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for crmstudent
-- ----------------------------
DROP TABLE IF EXISTS `crmstudent`;
CREATE TABLE `crmstudent` (
  `studentId` int(11) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(50) DEFAULT NULL,
  `telephone` varchar(50) DEFAULT NULL,
  `identity` varchar(18) DEFAULT NULL,
  `QQ` varchar(11) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `mustTuition` int(11) DEFAULT NULL,
  `actualTuition` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `school` varchar(100) DEFAULT NULL,
  `education` varchar(50) DEFAULT NULL,
  `professional` varchar(50) DEFAULT NULL,
  `identityAddress` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `remark` varchar(200) DEFAULT NULL,
  `homeTelephone` varchar(11) DEFAULT NULL,
  `homeContact` varchar(50) DEFAULT NULL,
  `classId` int(11) DEFAULT NULL,
  `referId` int(11) DEFAULT NULL,
  PRIMARY KEY (`studentId`),
  KEY `referId` (`referId`),
  CONSTRAINT `crmstudent_ibfk_1` FOREIGN KEY (`referId`) REFERENCES `crmrefer` (`referId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `crmclass` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `crmclass` VALUES ('2', '1', '2', '2', '2', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `crmclass` VALUES ('3', '1', '1', '1', '3', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `crmclass` VALUES ('4', '5', '6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `crmclass` VALUES ('5', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');
INSERT INTO `crmclass` VALUES ('6', 'c', '2', '2', null, '2', null, null, null, '2', null, null, null, null);
INSERT INTO `crmclass` VALUES ('7', 'cc+', '1', '1', null, '1', null, null, null, '1', null, null, null, null);
INSERT INTO `crmcoursetype` VALUES ('1', '100', '1', 'c', '1');
INSERT INTO `crmcoursetype` VALUES ('2', '2000', '50', 'jj', '66');
INSERT INTO `crmcoursetype` VALUES ('3', '12', '1', 'ja', 'mei');
INSERT INTO `crmcoursetype` VALUES ('4', '6', '6', '6c', '6');
INSERT INTO `crmcoursetype` VALUES ('5', '1', '1', '12c', '1');
INSERT INTO `crmdepartment` VALUES ('1', 'java学院');
INSERT INTO `crmdepartment` VALUES ('2', '咨询部');
INSERT INTO `crmdepartment` VALUES ('3', '人力资源部');
INSERT INTO `crmdepartment` VALUES ('4', '学工部');
INSERT INTO `crmdepartment` VALUES ('5', '就业部');
INSERT INTO `crmdepartment` VALUES ('6', '教学部');
INSERT INTO `crmpost` VALUES ('1', '总监', '1');
INSERT INTO `crmpost` VALUES ('2', '讲师', '1');
INSERT INTO `crmpost` VALUES ('3', '咨询部', '2');
INSERT INTO `crmpost` VALUES ('15', '2', null);
INSERT INTO `crmpost` VALUES ('16', '44', null);
INSERT INTO `crmstaff` VALUES ('1', 'gjn', '1111', '葛京能', '男', '2017/10/12', '1');
INSERT INTO `crmstaff` VALUES ('2', 'wzl', '1111', '吴兆龙', '男', '2017/10/12', '1');
INSERT INTO `crmstaff` VALUES ('3', 'wd', '1111', '吴东', '男', '2017/10/12', '2');
INSERT INTO `crmstaff` VALUES ('4', 'jy', '1111', '景阳', '女', '2017/10/12', '3');
