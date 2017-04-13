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
  `money` VARCHAR(100) NULL COMMENT '价格',
  `is_active` VARCHAR(2) NOT NULL DEFAULT 'Y' ,
  PRIMARY KEY (`goods_id`))
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = '商品';

CREATE TABLE `tescoplay`.`goods_images` (
  `goods_images_id` INT NOT NULL,
  `goods_id` INT NOT NULL,
  `image` MEDIUMBLOB NOT NULL,
  PRIMARY KEY (`goods_images_id`))
COMMENT = '商品图片';
