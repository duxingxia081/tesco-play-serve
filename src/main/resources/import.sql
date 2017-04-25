CREATE TABLE `tescoplay`.`goods_type` (
  `goods_type_id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(20) NOT NULL COMMENT '商品类型标题',
  `goods_type` VARCHAR(2) NOT NULL COMMENT '商品类型code',
  `goods_type_desc` VARCHAR(100) NULL COMMENT '商品类型描述',
  `is_active` VARCHAR(2) NOT NULL DEFAULT 'Y',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `goods_type_UNIQUE` (`goods_type` ASC),
  UNIQUE INDEX `title_UNIQUE` (`title` ASC))
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = '商品类型';

insert into goods_type(title,goods_type,goods_type_desc) values('热门推荐','01','比较热门的商品');
insert into goods_type(title,goods_type,goods_type_desc) values('医药保健','02','医药保健品');
insert into goods_type(title,goods_type,goods_type_desc) values('家乡特产','03','家乡特产');

CREATE TABLE `tescoplay`.`goods` (
  `goods_id` INT NOT NULL AUTO_INCREMENT,
  `goods_type_id` INT NOT NULL,
  `goods_name` VARCHAR(20) NOT NULL COMMENT '商品名称',
  `goods_desc` VARCHAR(100) NULL COMMENT '商品描述',
  `first_image` VARCHAR(100) NOT NULL COMMENT '第一张图片',
  `money` FLOAT NULL COMMENT '价格',
  `is_active` VARCHAR(2) NOT NULL DEFAULT 'Y' ,
  `goods_level` VARCHAR(20) NOT NULL DEFAULT '推荐' COMMENT '商品级别',
  PRIMARY KEY (`goods_id`))
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = '商品';

CREATE TABLE `tescoplay`.`goods_images` (
  `goods_images_id` INT NOT NULL,
  `goods_id` INT NOT NULL,
  `image_path` VARCHAR(100) NOT NULL COMMENT '商品图片路径',
  PRIMARY KEY (`goods_images_id`))
COMMENT = '商品图片';

CREATE TABLE `tescoplay`.`users` (
  `user_id` INT NOT NULL,
  `user_level` VARCHAR(2) NOT NULL COMMENT '用户级别',
  `name` VARCHAR(20) NOT NULL COMMENT '姓名',
  `is_active` VARCHAR(42) NOT NULL DEFAULT 'Y',
  `accumulate_points` INT NOT NULL DEFAULT 0 COMMENT '积分',
  `created_date` DATE NOT NULL,
  PRIMARY KEY (`user_id`))
COMMENT = '用户信息';

CREATE TABLE `tescoplay`.`user_goods` (
  `user_goods_id` INT NOT NULL,
  `goods_id` INT NOT NULL,
  `user_id` INT NOT NULL,
  `buy_date` DATE NOT NULL COMMENT '购买时间',
  `buy_num` INT NOT NULL COMMENT '购买数量',
  `buy_money` FLOAT NOT NULL DEFAULT 0.00 COMMENT '购买金额',
  `is_active` VARCHAR(2) NOT NULL DEFAULT 'Y',
  PRIMARY KEY (`user_goods_id`))
COMMENT = '用户商品';

CREATE TABLE `tescoplay`.`goods_evaluate` (
  `goods_evaluate_id` INT NOT NULL,
  `goods_id` INT NOT NULL,
  `goods_evaluate` VARCHAR(100) NOT NULL COMMENT '评价',
  `goods_evaluate_level` INT NOT NULL DEFAULT 5 COMMENT '评价级别',
  `goods_evaluate_date` DATE NOT NULL COMMENT '评价时间',
  PRIMARY KEY (`goods_evaluate_id`))
COMMENT = '商品评价';

ALTER TABLE `tescoplay`.`goods`
ADD COLUMN `goods_points` INT NOT NULL DEFAULT 0 COMMENT '积分' AFTER `goods_level`;