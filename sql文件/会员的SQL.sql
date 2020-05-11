SET FOREIGN_KEY_CHECKS=0;
/*会员*/
DROP TABLE IF EXISTS `clothesppsdb`.`huiyuan`;
/*会员卡*/
DROP TABLE IF EXISTS `clothesppsdb`.`huiyuankai`;
/*会员等级*/
DROP TABLE IF EXISTS `clothesppsdb`.`dengji`;
/*消费*/
DROP TABLE IF EXISTS `clothesppsdb`.`xiaofei`;
/*注销*/
DROP TABLE IF EXISTS `clothesppsdb`.`zhuxiao`;

CREATE TABLE `huiyuan` (
  `hyid` VARCHAR(20) NOT NULL COMMENT '会员编号，主键',
  `hykh` VARCHAR(20) DEFAULT NULL COMMENT '会员卡号，外键',
  `hyname` VARCHAR(20) NOT NULL COMMENT '姓名',
  `hysex` CHAR(4) NOT NULL COMMENT '性别',
  `hyage` INT(11) NOT NULL COMMENT '年龄',
  `hydanwei` VARCHAR(20) NOT NULL COMMENT '工作单位',
  `hylianxi` VARCHAR(20) NOT NULL COMMENT '联系方式',
  PRIMARY KEY (`hyid`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
SELECT * FROM `huiyuan` ;
/*会员*/
BEGIN;
LOCK TABLES `clothesppsdb`.`huiyuan` WRITE;
DELETE FROM `clothesppsdb`.`huiyuan`;
UNLOCK TABLES;
COMMIT;

CREATE TABLE `huiyuankai` (
  `hykkh` VARCHAR(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '会员卡卡号，主键',
  `hykdjid` INT(11) DEFAULT NULL COMMENT '等级编号，外键',
  `hykTime` DATETIME NOT NULL COMMENT '注册时间',
  PRIMARY KEY (`hykkh`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='会员卡信息表';
SELECT * FROM `huiyuankai` ;
/*会员卡*/
BEGIN;
LOCK TABLES `clothesppsdb`.`huiyuankai` WRITE;
DELETE FROM `clothesppsdb`.`huiyuankai`;
UNLOCK TABLES;
COMMIT;

CREATE TABLE `dengji` (
  `djid` INT(11) NOT NULL AUTO_INCREMENT COMMENT '等级编号，主键',
  `djname` CHAR(20) NOT NULL COMMENT '等级名称',
  `djyouhui` DOUBLE NOT NULL COMMENT '等级优惠',
  PRIMARY KEY (`djid`) USING BTREE
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
SELECT * FROM `dengji` ;
/*会员等级*/
BEGIN;
LOCK TABLES `clothesppsdb`.`dengji` WRITE;
DELETE FROM `clothesppsdb`.`dengji`;
INSERT INTO `clothesppsdb`.`dengji` (`djid`,`djname`,`djyouhui`) VALUES (1, '会员', 8.5);
UNLOCK TABLES;
COMMIT;

CREATE TABLE `xiaofei` (
  `hykid` VARCHAR(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '会员卡卡号，主键',
  `spid` INT(11) DEFAULT NULL COMMENT '商品编号，主键',
  `Xfsl` INT(11) NOT NULL COMMENT '购买数量',
  PRIMARY KEY (`hykid`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='会员消费记录表';
SELECT * FROM `xiaofei` ;
/*会员消费*/
BEGIN;
LOCK TABLES `clothesppsdb`.`xiaofei` WRITE;
DELETE FROM `clothesppsdb`.`xiaofei`;
UNLOCK TABLES;
COMMIT;

CREATE TABLE `zhuxiao` (
  `hykkh` VARCHAR(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '会员卡卡号，主键',
  `Zxtime` DATETIME NOT NULL COMMENT '注销时间',
  PRIMARY KEY (`hykkh`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci ROW_FORMAT=DYNAMIC COMMENT='会员卡注销表';
SELECT * FROM `zhuxiao` ;
/*会员注销*/
BEGIN;
LOCK TABLES `clothesppsdb`.`zhuxiao` WRITE;
DELETE FROM `clothesppsdb`.`zhuxiao`;
UNLOCK TABLES;
COMMIT;