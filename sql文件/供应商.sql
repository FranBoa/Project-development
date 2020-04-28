/*
Navicat MySQL Data Transfer

Source Server         : ks
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : clothesppsdb

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-04-28 02:42:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '供应商id',
  `sno` varchar(255) NOT NULL COMMENT '供应商编号',
  `stypeid` int(255) NOT NULL COMMENT '供应商类型id',
  `sname` varchar(255) NOT NULL COMMENT '供应商名字',
  `scontacts` varchar(255) NOT NULL COMMENT '首要联系人',
  `pnumber` int(12) NOT NULL COMMENT '手机号码',
  `lnumber` int(11) DEFAULT NULL COMMENT '座机号码',
  `cinformation` varchar(255) NOT NULL COMMENT '联系方式',
  `caddress` varchar(255) NOT NULL COMMENT '联系地址',
  `sdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '日期',
  `opayables` varchar(255) NOT NULL COMMENT '期初应付款',
  `oprepayment` varchar(255) NOT NULL COMMENT '期初预付款',
  `vatrate` varchar(255) NOT NULL COMMENT '增值税税率',
  `tinumber` varchar(255) NOT NULL COMMENT '纳税人识别号',
  `bank` varchar(255) NOT NULL COMMENT '开户银行',
  `bankaccount` int(16) NOT NULL COMMENT '银行账号',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', 'TGS1001', '1', '衡阳布料供应商', 'yh', '1234567891', '6324', '1725761758', '衡阳', '2020-04-26 14:29:56', '1000', '5000', '10%', '12321', '建设银行', '1231364646');
