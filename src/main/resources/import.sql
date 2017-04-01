CREATE TABLE `tescoplay`.`goods_type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(20) NOT NULL COMMENT '��Ʒ���ͱ���',
  `goods_type` VARCHAR(2) NOT NULL COMMENT '��Ʒ����code',
  `goods_type_desc` VARCHAR(100) NULL COMMENT '��Ʒ��������',
  `is_active` VARCHAR(2) NOT NULL DEFAULT 'Y' AFTER `goods_type_desc`,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `goods_type_UNIQUE` (`goods_type` ASC),
  UNIQUE INDEX `title_UNIQUE` (`title` ASC))
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_bin
COMMENT = '��Ʒ����';

insert into goods_type(title,goods_type,goods_type_desc) values('�����Ƽ�','01','�Ƚ����ŵ���Ʒ');
insert into goods_type(title,goods_type,goods_type_desc) values('ҽҩ����','02','ҽҩ����Ʒ');
insert into goods_type(title,goods_type,goods_type_desc) values('�����ز�','03','�����ز�');
