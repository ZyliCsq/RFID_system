/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : rfid

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 28/03/2022 20:01:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for rfidtable
-- ----------------------------
DROP TABLE IF EXISTS `rfidtable`;
CREATE TABLE `rfidtable`  (
  `rfid_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '构件编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '构件名称',
  `state_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '构件状态编号',
  `rfidbs` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cpjj` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`rfid_no`, `state_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rfidtable
-- ----------------------------
INSERT INTO `rfidtable` VALUES ('121212', '构件10086', '010B', '0000', '这是一个构件');
INSERT INTO `rfidtable` VALUES ('D5D610E2DB75', '构件1', '011A', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D63F9D8BFD', '构件2', '011', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D63F9E2CCD', '构件3', '010A', '0000', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D63FA29F6D', '构件4', '010B', '0000', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D63FA2AE6D', '构件5', '101', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D63FA8AEED', '构件6', '011B', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A44BDAB0', '构件7', '001', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A4527900', '构件8', '000', '0000', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A452F840', '构件9', '010A', '0000', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A4539F30', '构件10', '101', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A4542E80', '构件11', '011', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A45484B0', '构件12', '101', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A455EA40', '构件13', '101', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A456EBF0', '构件14', '101', '3E3D', '简介待定');
INSERT INTO `rfidtable` VALUES ('D5D6A4570440', '构件15', '011', '3E3D', '简介待定');

-- ----------------------------
-- Table structure for state
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state`  (
  `state_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '构件状态编号',
  `state` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '构件状态',
  PRIMARY KEY (`state_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO `state` VALUES ('000', '生产完成');
INSERT INTO `state` VALUES ('001', '生产运输中');
INSERT INTO `state` VALUES ('010A', '堆场A区存储中');
INSERT INTO `state` VALUES ('010B', '堆场B区存储中');
INSERT INTO `state` VALUES ('010C', '堆场C区存储中');
INSERT INTO `state` VALUES ('010D', '堆场D区存储中');
INSERT INTO `state` VALUES ('011', '堆场运输中');
INSERT INTO `state` VALUES ('011A', '堆场A区运输中');
INSERT INTO `state` VALUES ('011B', '堆场B区运输中');
INSERT INTO `state` VALUES ('011C', '堆场C区运输中');
INSERT INTO `state` VALUES ('011D', '堆场D区运输中');
INSERT INTO `state` VALUES ('100', '到达目的地');
INSERT INTO `state` VALUES ('101', '发货运输中');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 125 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (123, '123', '123', '123@qq.com');
INSERT INTO `t_user` VALUES (124, '111111111', '11111', '1276575026@qq.com');
INSERT INTO `t_user` VALUES (125, '1234', '123', '123');

SET FOREIGN_KEY_CHECKS = 1;
