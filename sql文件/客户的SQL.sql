SET FOREIGN_KEY_CHECKS=0;
/*客户*/
DROP TABLE IF EXISTS `clothesppsdb`.`kehu`;
/*客户类别*/
DROP TABLE IF EXISTS `clothesppsdb`.`category`;  

CREATE TABLE `kehu` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '客户编号',
  `grade` VARCHAR(20) NOT NULL COMMENT '客户等级',
  `NAME` VARCHAR(20) NOT NULL COMMENT '客户名称',
  `cid` VARCHAR(20) DEFAULT NULL COMMENT '类别编号',
  `sell` VARCHAR(20) NOT NULL COMMENT '销售人员',
  `Contact` VARCHAR(20) NOT NULL COMMENT '联系人',
  `mobile_phone` VARCHAR(20) NOT NULL COMMENT '手机',
  `Address` VARCHAR(20) DEFAULT NULL COMMENT '送货地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
SELECT * FROM `kehu` ;
/*客户*/
BEGIN;
LOCK TABLES `clothesppsdb`.`kehu` WRITE;
DELETE FROM `clothesppsdb`.`kehu`;
INSERT INTO `clothesppsdb`.`kehu` (`id`,`grade`,`NAME`,`cid`,`sell`,`Contact`,`mobile_phone`,`Address`) VALUES (1, '普通', '张三', '0001', '李四', '张三', '15649376549', '湖南长沙'),(2, '会员', '校长', '0001', '李四', '校长', '14372546152', '湖南长沙'),(3, '普通', '小计', '0001', '李四', '小计', '14321567951', '湖南长沙');
UNLOCK TABLES;
COMMIT;

CREATE TABLE `category` (
  `cid` INT(11) NOT NULL AUTO_INCREMENT COMMENT '类别编号',
  `NAME` VARCHAR(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '类别名称',
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=COMPACT COMMENT='客户类别';
SELECT * FROM `category` ;
/*客户类别*/
BEGIN;
LOCK TABLES `clothesppsdb`.`category` WRITE;
DELETE FROM `clothesppsdb`.`category`;
INSERT INTO `clothesppsdb`.`category` (`cid`,`NAME`) VALUES (1, '零散客户'),(2, '零散客户'),(3, '零散客户');
UNLOCK TABLES;
COMMIT;