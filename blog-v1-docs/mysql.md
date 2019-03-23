```mysql
# 初始化用户表
DROP TABLE
IF EXISTS t_user;

CREATE TABLE t_user (
	id BIGINT (11) PRIMARY KEY auto_increment COMMENT '博主唯一表示,系统初始化创建，不可更改',
	username VARCHAR (255) NOT NULL COMMENT '用户名',
	PASSWORD VARCHAR (255) NOT NULL COMMENT '密码',
	description VARCHAR (255) NOT NULL COMMENT '一句话描述',
	email VARCHAR (255) NOT NULL COMMENT '用于激活博客的邮箱',
	STATUS TINYINT (10) NOT NULL COMMENT '用户激活的状态，0表示未激活，1表示激活',
	flag TINYINT (10) NOT NULL COMMENT '用户名删除状态，0表示删除，1在回收站，2正常使用',
	create_time datetime NOT NULL COMMENT '创建时间',
	update_time datetime NOT NULL COMMENT '更新时间',
	create_user BIGINT (11) NOT NULL COMMENT '创建人',
	update_user BIGINT (11) NOT NULL COMMENT '更新人'
)

```