CREATE TABLE `tescoplay`.`goods_type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(20) NOT NULL COMMENT '商品类型标题',
  `goods_type` VARCHAR(2) NOT NULL COMMENT '商品类型code',
  `goods_type_desc` VARCHAR(100) NULL COMMENT '商品类型描述',
  `is_active` VARCHAR(2) NOT NULL DEFAULT 'Y' AFTER `goods_type_desc`,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `goods_type_UNIQUE` (`goods_type` ASC),
  UNIQUE INDEX `title_UNIQUE` (`title` ASC))
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = '商品类型';

insert into goods_type(title,goods_type,goods_type_desc) values('热门推荐','01','比较热门的商品');
insert into goods_type(title,goods_type,goods_type_desc) values('医药保健','02','医药保健品');
insert into goods_type(title,goods_type,goods_type_desc) values('家乡特产','03','家乡特产');
