/*
 Navicat Premium Data Transfer

 Source Server         : javaee02
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : 192.168.235.128:3306
 Source Schema         : cloudDB01

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 26/02/2019 22:53:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `dname` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `db_source` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据源',
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'cloudDB01');
INSERT INTO `dept` VALUES (2, '人事部', 'cloudDB01');
INSERT INTO `dept` VALUES (3, '财务部', 'cloudDB01');
INSERT INTO `dept` VALUES (4, '市场部', 'cloudDB01');
INSERT INTO `dept` VALUES (5, '运维部', 'cloudDB01');

SET FOREIGN_KEY_CHECKS = 1;
