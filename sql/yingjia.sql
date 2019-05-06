-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.0.24-community-nt - MySQL Community Edition (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 yingjia 的数据库结构
CREATE DATABASE IF NOT EXISTS `yingjia` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `yingjia`;


-- 导出  表 yingjia.business 结构
CREATE TABLE IF NOT EXISTS `business` (
  `bus_id` int(11) NOT NULL auto_increment,
  `bus_name` varchar(50) default NULL,
  `bus_phone` varchar(50) NOT NULL,
  `bus_password` varchar(50) NOT NULL,
  `bus_loc` varchar(80) default NULL COMMENT '地址',
  `bus_level` int(11) default NULL,
  `bus_contact` varchar(50) default NULL COMMENT '店铺联系方式',
  `bus_introduction` varchar(256) default NULL COMMENT '店铺简介',
  `bus_pic` varchar(128) default NULL COMMENT '店铺头像',
  PRIMARY KEY  (`bus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家表';

-- 正在导出表  yingjia.business 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
/*!40000 ALTER TABLE `business` ENABLE KEYS */;


-- 导出  表 yingjia.business-dishes 结构
CREATE TABLE IF NOT EXISTS `business-dishes` (
  `business-dishes_id` int(11) NOT NULL auto_increment,
  `bus_id` int(11) NOT NULL,
  `dishes_id` int(11) NOT NULL,
  `special_level` int(11) default NULL COMMENT 'level（普通、特色）',
  `quality_level` int(11) default NULL COMMENT 'level（一般 优享 御用）',
  `business-dishes_pic` varchar(128) default NULL,
  PRIMARY KEY  (`business-dishes_id`),
  KEY `FK_business-dishes_business` (`bus_id`),
  KEY `FK_business-dishes_dishes` (`dishes_id`),
  CONSTRAINT `FK_business-dishes_business` FOREIGN KEY (`bus_id`) REFERENCES `business` (`bus_id`),
  CONSTRAINT `FK_business-dishes_dishes` FOREIGN KEY (`dishes_id`) REFERENCES `dishes` (`dishes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家-菜品关联表';

-- 正在导出表  yingjia.business-dishes 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `business-dishes` DISABLE KEYS */;
/*!40000 ALTER TABLE `business-dishes` ENABLE KEYS */;


-- 导出  表 yingjia.dietitian 结构
CREATE TABLE IF NOT EXISTS `dietitian` (
  `dietitian_id` int(11) NOT NULL auto_increment,
  `dietitian_nickname` varchar(50) default NULL COMMENT '昵名',
  `dietitian_phone` varchar(50) NOT NULL,
  `dietitian_password` varchar(50) NOT NULL,
  `dietitian_number` int(20) NOT NULL COMMENT '身份证号',
  `dietitian_name` varchar(50) NOT NULL COMMENT '真实姓名',
  `dietitian_level` int(11) default NULL COMMENT '营养师评级',
  `wallet` int(11) default NULL COMMENT '钱包',
  `dietitian_pic` varchar(128) default NULL,
  `dietitian_time` datetime default NULL,
  PRIMARY KEY  (`dietitian_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='营养师';

-- 正在导出表  yingjia.dietitian 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `dietitian` DISABLE KEYS */;
/*!40000 ALTER TABLE `dietitian` ENABLE KEYS */;


-- 导出  表 yingjia.dishes 结构
CREATE TABLE IF NOT EXISTS `dishes` (
  `dishes_id` int(11) NOT NULL auto_increment,
  `dishes_name` varchar(50) default NULL,
  `dishes_protein` int(11) default NULL COMMENT '蛋白质 kj/g',
  `dishes_fat` int(11) default NULL COMMENT '脂肪 kj/g',
  `dishes_carbohydrate` int(11) default NULL COMMENT '碳水化合物有 kj/g',
  `dishes_pic` varchar(128) default NULL,
  PRIMARY KEY  (`dishes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜品';

-- 正在导出表  yingjia.dishes 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `dishes` DISABLE KEYS */;
/*!40000 ALTER TABLE `dishes` ENABLE KEYS */;


-- 导出  表 yingjia.ingre-deshes 结构
CREATE TABLE IF NOT EXISTS `ingre-deshes` (
  `ingre-deshes_id` int(11) NOT NULL auto_increment,
  `dishes_id` int(11) NOT NULL,
  `ingre_id` int(11) NOT NULL COMMENT '食材id',
  PRIMARY KEY  (`ingre-deshes_id`),
  KEY `FK_ingre-deshes_ingredients` (`ingre_id`),
  KEY `FK_ingre-deshes_dishes` (`dishes_id`),
  CONSTRAINT `FK_ingre-deshes_dishes` FOREIGN KEY (`dishes_id`) REFERENCES `dishes` (`dishes_id`),
  CONSTRAINT `FK_ingre-deshes_ingredients` FOREIGN KEY (`ingre_id`) REFERENCES `ingredients` (`ingre_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='食材-菜品关联表';

-- 正在导出表  yingjia.ingre-deshes 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `ingre-deshes` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingre-deshes` ENABLE KEYS */;


-- 导出  表 yingjia.ingredients 结构
CREATE TABLE IF NOT EXISTS `ingredients` (
  `ingre_id` int(11) NOT NULL auto_increment COMMENT '食材id',
  `ingre_name` varchar(50) default NULL COMMENT '食材名称',
  `ingre_protein` int(11) default NULL COMMENT '蛋白质 kj/g',
  `ingre_fat` int(11) default NULL COMMENT '脂肪 kj/g',
  `ingre_carbohydrate` int(11) default NULL COMMENT '碳水化合物有 kj/g',
  PRIMARY KEY  (`ingre_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='食材';

-- 正在导出表  yingjia.ingredients 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `ingredients` DISABLE KEYS */;
/*!40000 ALTER TABLE `ingredients` ENABLE KEYS */;


-- 导出  表 yingjia.menu 结构
CREATE TABLE IF NOT EXISTS `menu` (
  `menu_id` int(11) NOT NULL auto_increment,
  `dietitian_id` int(11) NOT NULL,
  `series_id` int(11) NOT NULL,
  `menu_name` varchar(50) default NULL,
  PRIMARY KEY  (`menu_id`),
  KEY `FK_menu_dietitian` (`dietitian_id`),
  KEY `FK_menu_series` (`series_id`),
  CONSTRAINT `FK_menu_dietitian` FOREIGN KEY (`dietitian_id`) REFERENCES `dietitian` (`dietitian_id`),
  CONSTRAINT `FK_menu_series` FOREIGN KEY (`series_id`) REFERENCES `series` (`series_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜谱表';

-- 正在导出表  yingjia.menu 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;


-- 导出  表 yingjia.menu-ingre_deshes 结构
CREATE TABLE IF NOT EXISTS `menu-ingre_deshes` (
  `menu-ingre_deshes_id` int(11) NOT NULL auto_increment,
  `ingre-deshes_id` int(11) default NULL,
  `menu_id` int(11) default NULL,
  `content` int(11) default NULL COMMENT '含量',
  PRIMARY KEY  (`menu-ingre_deshes_id`),
  KEY `FK_menu-ingre_deshes_menu` (`menu_id`),
  KEY `FK_menu-ingre_deshes_ingre-deshes` (`ingre-deshes_id`),
  CONSTRAINT `FK_menu-ingre_deshes_ingre-deshes` FOREIGN KEY (`ingre-deshes_id`) REFERENCES `ingre-deshes` (`ingre-deshes_id`),
  CONSTRAINT `FK_menu-ingre_deshes_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜谱和菜品-食材的关联表';

-- 正在导出表  yingjia.menu-ingre_deshes 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `menu-ingre_deshes` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu-ingre_deshes` ENABLE KEYS */;


-- 导出  表 yingjia.push 结构
CREATE TABLE IF NOT EXISTS `push` (
  `push_id` int(11) NOT NULL auto_increment,
  `push_name` varchar(50) default NULL,
  `push_type` int(11) default NULL COMMENT '三种',
  `dietitian_id` int(11) NOT NULL COMMENT '营养师外键',
  `push_content` text COMMENT '推送内容',
  PRIMARY KEY  (`push_id`),
  KEY `FK_push_dietitian` (`dietitian_id`),
  CONSTRAINT `FK_push_dietitian` FOREIGN KEY (`dietitian_id`) REFERENCES `dietitian` (`dietitian_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推送表';

-- 正在导出表  yingjia.push 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `push` DISABLE KEYS */;
/*!40000 ALTER TABLE `push` ENABLE KEYS */;


-- 导出  表 yingjia.series 结构
CREATE TABLE IF NOT EXISTS `series` (
  `series_id` int(11) NOT NULL auto_increment,
  `series_name` varchar(50) default NULL,
  PRIMARY KEY  (`series_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系列表';

-- 正在导出表  yingjia.series 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `series` DISABLE KEYS */;
/*!40000 ALTER TABLE `series` ENABLE KEYS */;


-- 导出  表 yingjia.type_age 结构
CREATE TABLE IF NOT EXISTS `type_age` (
  `age_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `age_name` varchar(50) default NULL,
  `age_type` int(2) default NULL,
  PRIMARY KEY  (`age_id`),
  KEY `FK_age_menu` (`menu_id`),
  CONSTRAINT `FK_age_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='年龄';

-- 正在导出表  yingjia.type_age 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_age` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_age` ENABLE KEYS */;


-- 导出  表 yingjia.type_allergen 结构
CREATE TABLE IF NOT EXISTS `type_allergen` (
  `allergen_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `allergen_name` varchar(50) default NULL,
  `allergen_type` int(2) default NULL,
  PRIMARY KEY  (`allergen_id`),
  KEY `FK_allergen_menu` (`menu_id`),
  CONSTRAINT `FK_allergen_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='过敏原';

-- 正在导出表  yingjia.type_allergen 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_allergen` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_allergen` ENABLE KEYS */;


-- 导出  表 yingjia.type_constitution 结构
CREATE TABLE IF NOT EXISTS `type_constitution` (
  `constitution_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `constitution_name` varchar(50) default NULL,
  `constitution_type` int(2) default NULL,
  PRIMARY KEY  (`constitution_id`),
  KEY `FK_constitution_menu` (`menu_id`),
  CONSTRAINT `FK_constitution_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='体质指标';

-- 正在导出表  yingjia.type_constitution 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_constitution` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_constitution` ENABLE KEYS */;


-- 导出  表 yingjia.type_dinnertime 结构
CREATE TABLE IF NOT EXISTS `type_dinnertime` (
  `dinnertime_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `dinnertime_name` varchar(50) default NULL,
  `dinnertime_type` int(2) default NULL,
  PRIMARY KEY  (`dinnertime_id`),
  KEY `FK_dinnertime_menu` (`menu_id`),
  CONSTRAINT `FK_dinnertime_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用餐时间';

-- 正在导出表  yingjia.type_dinnertime 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_dinnertime` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_dinnertime` ENABLE KEYS */;


-- 导出  表 yingjia.type_drink 结构
CREATE TABLE IF NOT EXISTS `type_drink` (
  `drink_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `drink_name` varchar(50) default NULL,
  `drink_type` int(2) default NULL,
  PRIMARY KEY  (`drink_id`),
  KEY `FK_drink_menu` (`menu_id`),
  CONSTRAINT `FK_drink_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='饮品偏好';

-- 正在导出表  yingjia.type_drink 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_drink` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_drink` ENABLE KEYS */;


-- 导出  表 yingjia.type_flavor 结构
CREATE TABLE IF NOT EXISTS `type_flavor` (
  `flavor_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `flavor_name` varchar(50) default NULL COMMENT '酸、甜、麻辣..',
  `flavor_type` int(2) default NULL COMMENT '对应的口味',
  PRIMARY KEY  (`flavor_id`),
  KEY `FK_flavor_menu` (`menu_id`),
  CONSTRAINT `FK_flavor_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='口味表';

-- 正在导出表  yingjia.type_flavor 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_flavor` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_flavor` ENABLE KEYS */;


-- 导出  表 yingjia.type_mealtype 结构
CREATE TABLE IF NOT EXISTS `type_mealtype` (
  `mealtype_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `mealtype_name` varchar(50) default NULL,
  `mealtype_type` int(2) default NULL,
  PRIMARY KEY  (`mealtype_id`),
  KEY `FK_mealtype_menu` (`menu_id`),
  CONSTRAINT `FK_mealtype_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用餐类型';

-- 正在导出表  yingjia.type_mealtype 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_mealtype` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_mealtype` ENABLE KEYS */;


-- 导出  表 yingjia.type_motion 结构
CREATE TABLE IF NOT EXISTS `type_motion` (
  `motion_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `motion_name` varchar(50) default NULL,
  `motion_type` int(2) default NULL,
  PRIMARY KEY  (`motion_id`),
  KEY `FK__menu` (`menu_id`),
  CONSTRAINT `FK__menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='运动指数';

-- 正在导出表  yingjia.type_motion 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_motion` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_motion` ENABLE KEYS */;


-- 导出  表 yingjia.type_plan 结构
CREATE TABLE IF NOT EXISTS `type_plan` (
  `plan_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `plan_name` varchar(50) default NULL COMMENT '减肥方案、健身方案...',
  `plan_type` int(2) default NULL COMMENT '对应的方案',
  PRIMARY KEY  (`plan_id`),
  KEY `FK_plan_menu` (`menu_id`),
  CONSTRAINT `FK_plan_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='营养方案';

-- 正在导出表  yingjia.type_plan 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_plan` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_plan` ENABLE KEYS */;


-- 导出  表 yingjia.type_sex 结构
CREATE TABLE IF NOT EXISTS `type_sex` (
  `sex_id` int(11) NOT NULL auto_increment,
  `menu_id` int(11) default NULL,
  `sex_name` varchar(50) default NULL,
  `sex_type` int(2) default NULL,
  PRIMARY KEY  (`sex_id`),
  KEY `FK_sex_menu` (`menu_id`),
  CONSTRAINT `FK_sex_menu` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='性别';

-- 正在导出表  yingjia.type_sex 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `type_sex` DISABLE KEYS */;
/*!40000 ALTER TABLE `type_sex` ENABLE KEYS */;


-- 导出  表 yingjia.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_nickname` varchar(50) default NULL COMMENT '昵名',
  `user_phone` varchar(50) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `user_number` int(20) NOT NULL COMMENT '身份证号',
  `user_name` varchar(50) NOT NULL COMMENT '真实姓名',
  `user_height` int(11) default NULL COMMENT '身高',
  `user_weight` int(11) default NULL COMMENT '体重',
  `user_birth` datetime default NULL COMMENT '生日',
  `sex` int(2) default NULL COMMENT '性别',
  `hometown` varchar(50) default NULL COMMENT '家乡',
  `user_pic` varchar(128) default NULL,
  `user_time` datetime default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 正在导出表  yingjia.user 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`, `user_nickname`, `user_phone`, `user_password`, `user_number`, `user_name`, `user_height`, `user_weight`, `user_birth`, `sex`, `hometown`, `user_pic`, `user_time`) VALUES
	(1, 'test', '12345789', '123456789', 123456789, '李云龙', 180, 190, '2019-04-28 22:13:55', 1, '1', '', '2019-04-28 22:14:05');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
