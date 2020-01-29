CREATE DATABASE IF NOT EXISTS helloworld
				DEFAULT CHARACTER SET utf8  ## 指定字符集
				DEFAULT COLLATE utf8_general_ci ; ## 指定校对规则

USE helloworld;
CREATE TABLE IF NOT EXISTS customer(
		id int(11) PRIMARY KEY auto_increment,
		cname varchar(30),
		address varchar(50),
		phone varchar(30)
);
SHOW CREATE TABLE customer;
DESC customer;

ALTER TABLE customer ADD CONSTRAINT name_uniq UNIQUE(cname);  -- 为cname字段添加唯一性约束

DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer(
		id int(11) PRIMARY KEY auto_increment,
		cname varchar(30) NOT NULL UNIQUE,
		address varchar(50),
		phone varchar(30),
		remark text DEFAULT NULL
);
DESC customer;