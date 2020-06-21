drop database if exists tiangong;
create database tiangong;
use tiangong;
-- 1. 管理员表
drop table if exists Admin;
create table admin(
	id int(11) primary key AUTO_INCREMENT,
    name varchar(32) not null unique,
    password varchar(32) not null,
    level tinyint(1) not null,
    isdelete  tinyint(1) default 0
);

insert into admin(name,password,level) values('root','root',0);
insert into admin(name,password,level) values('yqyh','123',0);
insert into admin(name,password,level) values('admin1','123',0);

-- 2.用户表
drop table if exists tb_user;
create table tb_user(
	id int(11) primary key AUTO_INCREMENT,
	phone varchar(20) not null unique,
	password varchar(32) not null,
	gender tinyint(1),
	status tinyint(1) default 1,
	level int(1) default 0,
	username varchar(32) not null unique,
	province varchar(32),
	city varchar(32),
	reg_time datetime,
	last_login datetime,
	avatar_url varchar(100),
	e_mail varchar(32),
	focus_count int default 0,
	focused_count int default 0,
	favor_count int default 0,
	msg_count_not_read int default 0,
	noAdv_time datetime,
	money DECIMAL(6,2) default 0,
	mtto varchar(100)
);

insert into tb_user(phone,password,username) value('17816119937','123','yqyh');
insert into tb_user(phone,password,username) value('110','123','chen');
insert into tb_user(phone,password,username) value('1111111111','123','lw');
insert into tb_user(phone,password,username) value('666','123','user1');

-- 3.系列表
drop table if exists Series;
create table  Series(
	id int(11) primary key AUTO_INCREMENT,
	name varchar(32) not null unique
);



-- 类型表
drop table if exists Types;
create table Types(
	id int(11) primary key AUTO_INCREMENT,
	name varchar(32) not null unique
);
insert into types(name) values('雕塑');


-- 类型流量数据表
drop table if exists Type_datas;
create table Type_datas(
	id int(11) primary key AUTO_INCREMENT,
	type_id int(11),
	time date not null,
	video_flow bigint default 0,
	course_flow bigint default 0,
	article_flow bigint default 0,
	FOREIGN KEY (type_id)  REFERENCES Types(id)
);

-- 词条表(0)
drop table if exists Entries;
create table Entries(
	id int(11) primary key AUTO_INCREMENT,
	name varchar(32) not null unique,
	type varchar(20),
	type_id int(11),
	click int default 0,
	FOREIGN KEY (type_id)  REFERENCES Types(id)
);

-- 工艺品表
drop table if exists Craft;
create  table Craft(
	id int(11) primary key AUTO_INCREMENT,
	name varchar(32) not null unique,
	user_id int(11) not null,
	picture_url varchar(100) not null,
	3d_url varchar(100),
	type varchar(20),
	type_id int(11) not null,
	release_time datetime not null,
	like_count int default 0,
	favor_count int default 0,
	comments_count int default 0,
	click_count int default 0,
	share_count int default 0,
	isdelete tinyint(1) default 0,
	entries_id int,
	FOREIGN KEY (user_id)  REFERENCES tb_user(id),
	FOREIGN KEY (type_id)  REFERENCES Types(id),
	FOREIGN KEY (entries_id)  REFERENCES Entries(id)
);

-- 视频表
drop table if exists Video;
create table Video(
	id int(11) primary key AUTO_INCREMENT,
	name varchar(32) not null unique,
	user_id int(11) not null,
	cover_url varchar(200),
	video_url varchar(200) not null,
	release_time datetime not null,
	status tinyint(1) default 1,
	like_count int default 0,
	favor_count int default 0,
	comments_count int default 0,
	click_count int default 0,
	share_count int default 0,
	isdelete tinyint(1) default 0,
	des varchar(200),
	type varchar(20),
	type_id int(11) not null,
	craft_id int(11),
	isPass tinyint(1) default 0,
	ischeck tinyint(1) default 0,
	FOREIGN KEY (user_id)  REFERENCES tb_user(id),
	FOREIGN KEY (craft_id)  REFERENCES Craft(id),
	FOREIGN KEY (type_id)  REFERENCES Types(id)
);
insert into video(name,user_id,video_url,release_time,type,type_id) values('雕塑视频',1,'vedio/yqyh/ds.avi',now(),'雕塑',1);
insert into video(name,user_id,video_url,release_time,type,type_id) values('雕塑视频2',1,'vedio/yqyh/ds2.avi',now(),'雕塑',1);

-- 教程表
drop table if exists Course;
create table Course(
	id int(11) primary key AUTO_INCREMENT,
	name varchar(32) not null ,
	user_id int(11) not null,
	cover_url varchar(100),
	article_url varchar(100),
	course_url varchar(100),
	release_time datetime not null,
	status tinyint(1) default 1,
	like_count int default 0,
	favor_count int default 0,
	comments_count int default 0,
	click_count int default 0,
	share_count int default 0,
	isdelete tinyint(1) default 0,
	des varchar(200),
	type varchar(20),
	type_id int(11) not null,
	isPass tinyint(1) default 0,
	ischeck tinyint(1) default 0,
	tag tinyint(1) not null,
	series_id int,
	is_paid tinyint(1) default 0,
	FOREIGN KEY (user_id)  REFERENCES tb_user(id),
	FOREIGN KEY (series_id)  REFERENCES Series(id),
	FOREIGN KEY (type_id)  REFERENCES Types(id)
);

-- 文章表
drop table if exists Article;
create table Article(
	id int(11) primary key AUTO_INCREMENT,
	user_id int(11) not null,
	content_url Text not null,
	title varchar(32),
	cover_url varchar(100),
	type_id int(11) not null,
	status tinyint(1) default 1,
	post_time datetime,
	like_count int default 0,
	favor_count int default 0,
	comments_count int default 0,
	click_count int default 0,
	share_count int default 0,
	isdelete tinyint(1) default 0,
	craft_id int(11),
	isPass tinyint(1) default 0,
	ischeck tinyint(1) default 0,
	FOREIGN KEY (user_id)  REFERENCES tb_user(id),
	FOREIGN KEY (craft_id)  REFERENCES Craft(id),
	FOREIGN KEY (type_id)  REFERENCES Types(id)
);

create table Video_hot(
	id int(11) not null,
	score int default 0,
	FOREIGN KEY (id)  REFERENCES Video(id)
);

create table Article_hot(
	id int(11) not null,
	score int default 0,
	FOREIGN KEY (id)  REFERENCES Article(id)
);

create  table personnal_rec(
	user_id int(11),
	video_id int(11)
);

-- 关注表
drop table if exists focus;
create table focus(
	user_id int(11) not null,
	focus_id int(11) not null,
	FOREIGN KEY (user_id)  REFERENCES tb_user(id),
	FOREIGN KEY (focus_id)  REFERENCES tb_user(id)
);
insert into focus(user_id,focus_id) value(1,2);
insert into focus(user_id,focus_id) value(2,1);
insert into focus(user_id,focus_id) value(3,1);

-- 历史记录表
drop table  if exists history;
create table history(
	user_id int(11) not null,
	item_id int(11) not null,
	browse_time datetime not null,
	isdelete tinyint(1) default 0,
	type int(1),
	FOREIGN KEY (user_id)  REFERENCES tb_user(id)
);

insert into history(user_id,item_id,browse_time,type) values(1,1,now(),1);



-- 评论表
drop table  if exists tb_comments;
create table tb_comments(
	id int primary key AUTO_INCREMENT,
	user_id int(11) not null,
	item_id int(11) not null,
	is_reply tinyint(1) default 0,
	parent_id int,
	like_count int default 0,
	post_time datetime not null,
	isdelete tinyint(1) default 0,
	content varchar(200) not null,
	type int(1),
	status tinyint(1) default  0,
	FOREIGN KEY (user_id)  REFERENCES tb_user(id)
);


-- 消息表
drop table if exists Messages;
create table Messages(
	id int primary key AUTO_INCREMENT,
	sender_id int(11),
	recipient_id int(11),
	content varchar(200) not null,
	post_time datetime not null,
	isdelete tinyint(1) default 0,
	isread tinyint(1) default 0,
	FOREIGN KEY (sender_id)  REFERENCES tb_user(id),
	FOREIGN KEY (recipient_id)  REFERENCES tb_user(id)
);


-- 活动表（改动）
drop table if exists Activity;
create table Activity(
	id int(11) primary key AUTO_INCREMENT,
	name varchar(32) not null,
	cover_url varchar(100),
	content varchar(500),
	is_finish tinyint(1) default 0,
	time datetime not null,
	user_id int(11),
	FOREIGN KEY (user_id)  REFERENCES tb_user(id)
);
insert into Activity(name,time,user_id) values('活动1',now(),1);
insert into Activity(name,time,user_id) values('活动2',now(),1);

-- 百科表(0)
drop table if exists Introduction;
create table Introduction(
	id int primary key AUTO_INCREMENT,
	entries_id  int(11) not null,
	content text not null,
	version int(11) not null,
	user_id  int(11) not null,
	time datetime not null,
	reason varchar(200) not null,
	is_used tinyint(1) default 0,
	cover_url varchar(100),
	ischeck int(1) default 0,
	des varchar(500),
	FOREIGN KEY (user_id)  REFERENCES tb_user(id),
	FOREIGN KEY (entries_id)  REFERENCES Entries(id)
);

-- 活动成员表
drop table if exists Activity_members;
create table Activity_members(
	id int(11) not null,
	member_id int(11) not null,
	FOREIGN KEY (member_id)  REFERENCES tb_user(id),
	FOREIGN KEY (id)  REFERENCES Activity(id)
);

-- 公告表
drop table if exists announce;
create table announce(
	id int primary key AUTO_INCREMENT,
	sender_id int(11),
	content varchar(200) not null,
	post_time datetime not null,
	isdelete tinyint(1) default 0,
	click_count int default 0,
	title varchar(100),
	FOREIGN KEY (sender_id)  REFERENCES Admin(id)
);

-- 点赞表
drop table if exists tb_like;
create table tb_like(
	user_id int(11),
	id int(11),
	type int(1),
	FOREIGN KEY (user_id)  REFERENCES tb_user(id)
);

-- 动态表
drop table  if exists Dynamics;
create table Dynamics (
	id int primary key AUTO_INCREMENT,
	user_id int(11) not null,
	content varchar(200),
	like_count int default 0,
	comments_count int default 0,
	share_count  int default 0,
	post_time datetime ,
	isdelete tinyint(1) default 0,
	FOREIGN KEY (user_id)  REFERENCES tb_user(id)
);

-- 动态图表
drop table  if exists Dynamics_picture;
create table Dynamics_picture (
	id int,
	content_url varchar(100),
	FOREIGN KEY (id)  REFERENCES Dynamics(id)
);
-- 匠人认证表(变动)
drop table  if exists identifyArtist;
create table identifyArtist(
	id int primary key AUTO_INCREMENT,
	user_id int(11),
	post_time datetime,
	video_url varchar(150),
	isPass int(1) default 0,
	notes varchar(500),
	FOREIGN KEY (user_id)  REFERENCES tb_user(id)
);

-- 匠人认证素材表
drop table  if exists identifyMaterial;
create table identifyMaterial(
	id int,
	content_url varchar(100),
	FOREIGN KEY (id)  REFERENCES identifyArtist(id)
);

-- 收藏表
drop table if exists collection;
create table collection (
	user_id int,
	item_id int,
	type int(1),
	FOREIGN KEY (user_id)  REFERENCES tb_user(id)
);

-- 教程购买表
drop table if exists course_pay;
create table course_pay (
	user_id int,
	course_id int
);

-- 活动图表
drop table if exists activity_picture;
create table activity_picture (
	url varchar(100),
	activity_id int
);

