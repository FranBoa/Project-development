/*
MySQL Backup
Database: clothesppsdb
Backup Time: 2020-04-27 20:54:50
*/

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `clothesppsdb`.`invoice`;
DROP TABLE IF EXISTS `clothesppsdb`.`relatedsaleandorder2`;
DROP TABLE IF EXISTS `clothesppsdb`.`relatedsaleandorder`;
DROP TABLE IF EXISTS `clothesppsdb`.`saleandorder2`;
DROP TABLE IF EXISTS `clothesppsdb`.`saleandorder`;
CREATE TABLE `invoice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `OrderNumber` varchar(30) NOT NULL COMMENT '单据编号',
  `customername` varchar(30) NOT NULL COMMENT '客户',
  `iprice` varchar(20) NOT NULL COMMENT '金额',
  `InvoicedAmount` varchar(20) NOT NULL COMMENT '已开票金额',
  `AmountNotInvoiced` varchar(20) NOT NULL COMMENT '未开票金额',
  `CurrentInvoiceAmount` varchar(20) NOT NULL COMMENT '本次开票金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `relatedsaleandorder2` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `OrderNumber` varchar(30) NOT NULL COMMENT '编号',
  `rname` varchar(30) NOT NULL,
  `sunit` varchar(4) NOT NULL COMMENT '单位',
  `sprice` varchar(18) NOT NULL COMMENT '价格',
  `scount` varchar(10) NOT NULL COMMENT '数量',
  `stax` varchar(6) DEFAULT '无税率' COMMENT '税率',
  `wid` int(11) NOT NULL COMMENT '仓库',
  `sdiscount` varchar(6) DEFAULT '无折扣',
  `stotal` varchar(18) NOT NULL COMMENT '总价',
  `Remarks` varchar(30) DEFAULT NULL COMMENT '备注',
  `address` varchar(30) DEFAULT NULL COMMENT '地址',
  `paymethod` varchar(12) DEFAULT NULL COMMENT '支付方式',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `relatedsaleandorder` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `OrderNumber` varchar(30) NOT NULL COMMENT '编号',
  `rname` varchar(30) NOT NULL,
  `sunit` varchar(4) NOT NULL COMMENT '单位',
  `sprice` varchar(18) NOT NULL COMMENT '价格',
  `scount` varchar(10) NOT NULL COMMENT '数量',
  `stax` varchar(6) DEFAULT '无税率' COMMENT '税率',
  `wid` int(11) NOT NULL COMMENT '仓库',
  `sdiscount` varchar(6) DEFAULT '无折扣',
  `stotal` varchar(18) NOT NULL COMMENT '总价',
  `Remarks` varchar(30) DEFAULT NULL COMMENT '备注',
  `address` varchar(30) DEFAULT NULL COMMENT '地址',
  `paymethod` varchar(12) DEFAULT NULL COMMENT '支付方式',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
CREATE TABLE `saleandorder2` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `salesman` varchar(12) NOT NULL COMMENT '销售人员',
  `customername` varchar(30) NOT NULL COMMENT '客户',
  `status` varchar(12) DEFAULT '未收款' COMMENT '状态',
  `sdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '单据日期',
  `OrderNumber` varchar(30) NOT NULL COMMENT '编号',
  `Remarks` varchar(30) DEFAULT NULL COMMENT '备注',
  `stotal` varchar(18) NOT NULL COMMENT '总价',
  `author` varchar(12) NOT NULL COMMENT '制单人',
  `inspect` varchar(12) NOT NULL COMMENT '审核人',
  `address` varchar(30) DEFAULT NULL COMMENT '地址',
  `paymethod` varchar(12) DEFAULT NULL COMMENT '支付方式',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `saleandorder` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(12) NOT NULL DEFAULT '销货' COMMENT '类别',
  `salesman` varchar(12) NOT NULL COMMENT '销售人员',
  `customername` varchar(30) NOT NULL COMMENT '客户',
  `status` varchar(12) DEFAULT '未出库' COMMENT '状态',
  `sdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '单据日期',
  `rdate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '交货日期',
  `OrderNumber` varchar(30) NOT NULL COMMENT '编号',
  `OrderNumber2` varchar(30) DEFAULT '审核完成即可关联',
  `Remarks` varchar(30) DEFAULT NULL COMMENT '备注',
  `stotal` varchar(18) NOT NULL COMMENT '总价',
  `author` varchar(12) NOT NULL COMMENT '制单人',
  `inspect` varchar(12) DEFAULT NULL COMMENT '审核人',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
BEGIN;
LOCK TABLES `clothesppsdb`.`invoice` WRITE;
DELETE FROM `clothesppsdb`.`invoice`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `clothesppsdb`.`relatedsaleandorder2` WRITE;
DELETE FROM `clothesppsdb`.`relatedsaleandorder2`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `clothesppsdb`.`relatedsaleandorder` WRITE;
DELETE FROM `clothesppsdb`.`relatedsaleandorder`;
INSERT INTO `clothesppsdb`.`relatedsaleandorder` (`sid`,`OrderNumber`,`rname`,`sunit`,`sprice`,`scount`,`stax`,`wid`,`sdiscount`,`stotal`,`Remarks`,`address`,`paymethod`) VALUES (1, 'JH202040210001', '精灵宝钻', '个', '99999', '1', '无税率', 1, '无折扣', '99999', '这是精灵宝钻', NULL, '支付宝'),(2, 'JH202040210001', '死亡笔记', '本', '10', '1', '无税率', 1, '无折扣', '10', '这是死亡笔记', NULL, '微信'),(3, 'JH202040210002', '黑格子衫', '个', '25', '1', '无税率', 1, '无折扣', ' 25', ' 这是黑格子杉', NULL, '支付宝'),(4, 'JH202040210002', '白格子衫', '个', '25', '1', '无税率', 1, '无折扣', '25', '这是白格子衫', NULL, '货到付款'),(5, 'JH202040210002', '黑白格子装', '个', '0', '1', '无税率', 1, '无折扣', '0', '这是.....', NULL, '微信');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `clothesppsdb`.`saleandorder2` WRITE;
DELETE FROM `clothesppsdb`.`saleandorder2`;
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `clothesppsdb`.`saleandorder` WRITE;
DELETE FROM `clothesppsdb`.`saleandorder`;
INSERT INTO `clothesppsdb`.`saleandorder` (`sid`,`category`,`salesman`,`customername`,`status`,`sdate`,`rdate`,`OrderNumber`,`OrderNumber2`,`Remarks`,`stotal`,`author`,`inspect`) VALUES (1, '销货', 'yap', 'haha客户', '已出库', '2020-04-21 10:44:16', '2020-04-21 11:18:09', 'JH202040210001', '审核完成即可关联', '加大力度', '100008', 'yap', 'yap'),(2, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210002', '审核完成即可关联', '这是备注', '50', 'yap', ''),(3, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210003', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(4, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210004', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(5, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210005', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(6, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210006', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(7, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210007', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(8, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210008', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(9, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH202040210009', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(10, '销货', 'yap', 'xiaoxiao客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH2020402100010', '审核完成即可关联', '这是备注', '50', 'yap', NULL),(11, '销货', 'yap', 'lala客户', '未出库', '2020-04-26 10:25:37', '2020-04-26 10:25:37', 'JH2020402100011', '审核完成即可关联', '这是备注', '50', 'yap', NULL);
UNLOCK TABLES;
COMMIT;
