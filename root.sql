/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : root

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-31 16:44:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `parent_phone` varchar(255) DEFAULT NULL COMMENT '家长电话号码逗号分隔',
  `city` varchar(255) DEFAULT NULL COMMENT '居住城市json格式存储{"province":"广东省","city":"深圳市","district":"南山区"}',
  `net_name` varchar(255) DEFAULT NULL COMMENT '网名逗号分隔',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '小英', '13222222222,13333333333,15777777777', '{\"province\":\"广东省\",\"city\":\"深圳市\",\"district\":\"南山区\"}', '会飞的鱼,小小雪,茉莉香果果');
INSERT INTO `student` VALUES ('2', '小明', '13222222222,13333333333,15777777777', '{\"province\":\"广东省\",\"city\":\"深圳市\",\"district\":\"南山区\"}', '会飞的鱼2,小小雪2,茉莉香果果2');

-- ----------------------------
-- Table structure for tb_description
-- ----------------------------
DROP TABLE IF EXISTS `tb_description`;
CREATE TABLE `tb_description` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of tb_description
-- ----------------------------

-- ----------------------------
-- Table structure for tb_test
-- ----------------------------
DROP TABLE IF EXISTS `tb_test`;
CREATE TABLE `tb_test` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `falg` char(255) DEFAULT NULL,
  `text` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_test
-- ----------------------------

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '表id',
  `username` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `created` datetime DEFAULT NULL COMMENT '创建时间',
  `description_id` int(11) DEFAULT NULL COMMENT '关联详情id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户信息表';

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('46', 'iilibxc', '123456', null, null);
INSERT INTO `tb_user` VALUES ('47', 'iilibxc', '123456', null, null);
INSERT INTO `tb_user` VALUES ('48', 'iilibxc', 'iilibxc', '2020-12-29 16:05:10', '1');
