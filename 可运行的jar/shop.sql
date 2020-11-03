CREATE DATABASE shop;
USE shop;
 
 #商品表 -- tb_gds
 # 商品编号 -- goods_id
  #商品价格 -- goods_price
  #商品名称 -- goods_name
  #商品积分 -- goods_star
 # 商品所属企业商家 -- goods_company -- 商家表外键
 # 商品所属分类 -- goods_catagory -- 分类表外键
 # 商品所属物流公司管理 -- goods_car -- 物流方式外键
  
  CREATE TABLE tb_gds
  (goods_id INT PRIMARY KEY AUTO_INCREMENT ,  # 外键连接库存ID ----------- repo_id
   goods_price INT NOT NULL , 
   goods_name VARCHAR(32) NOT NULL , 
   goods_star INT NOT NULL , 
   goods_company INT NOT NULL , 
   goods_catagory INT NOT NULL , 
   goods_car VARCHAR(32) NOT NULL);
   
 
 #  ==================商品表END=====================
# 商品类别表 -- tb_gds_type
 # 商品类别ID type_id 主键 连接分类
 # 商品类别名称 type_name
 # 商品类别详细描述 type_desc  
  CREATE TABLE tb_gds_type
  (type_id INT PRIMARY KEY AUTO_INCREMENT , 
   type_name VARCHAR(32) NOT NULL ) ;
     
   
  # =================商品类别表END==================
 #商品评价表 -- tb_gds_co
  #评论编号 co_ids
  #评论内容 co_content
  #评论时间 co_time
 # 评论用户名 co_uname
  #评论ip地址 co_addr
  #评论所属商品ID co_id --  连接商品的评论   
   
  CREATE TABLE tb_gds_co
  (co_ids INT PRIMARY KEY AUTO_INCREMENT,
    co_content VARCHAR(64) NOT NULL , 
    co_time VARCHAR(32) NOT NULL , 
    co_uname VARCHAR(32) NOT NULL , 
    co_addr VARCHAR(32) NOT NULL,
    co_id INT NOT NULL);
         
    
    
 # ===================商品评价表END=============
  # 商家表 -- tb_pany
  # 商家ID pany_id
 # 商家名称 pany_name
 # 商家描述 pany_desc
 # 商家所属类型 pany_type
  
 CREATE TABLE tb_pany
  (pany_id INT PRIMARY KEY AUTO_INCREMENT , 
  pany_name VARCHAR(32) NOT NULL , 
  pany_desc VARCHAR(32) NOT NULL , 
  pany_type VARCHAR(32) NOT NULL );
  
  
  
# ==================商家表END================= 
 #库存数量 -- tb_repo
 # 商品编号 repo_id -- 就是商品ID 
  #商品所剩数量 repo_num
 # 商品分类 repo_type # 作为外键引入 ------------- type_id  
 # 商品价格 repo_price 
  
  
CREATE TABLE tb_repo
(repo_id INT PRIMARY KEY AUTO_INCREMENT , 
 repo_num INT NOT NULL);
 
 
 
 #===========库存表END=================
 #促销商品 -- tb_fast
  #计划上架时间 -- fast_up
 # 计划下架时间 -- fast_down
 # 数量 -- fast_num
 # 库存量 --fast_repo
 # 销售金额 -- fast_price
 
 
 CREATE TABLE tb_fast
 (fast_up VARCHAR(32) NOT NULL , 
  fast_down VARCHAR(32) NOT NULL ,
  fast_num INT NOT NULL , 
  fast_repo INT NOT NULL , 
  fast_price INT NOT NULL,
  fast_id int not null , 
  fast_show int not null);
  
 
  
  
# ==============促销商品表END============== 
   
 # 权限表 tb_power
  #权限ID power_id
 # 权限编号 power_num
 # 权限描述 power_desc
  
 CREATE TABLE tb_power
 (power_id INT PRIMARY KEY AUTO_INCREMENT , 
  power_desc VARCHAR(32) NOT NULL
  );     
  
  

  
  
  
 #==================权限表END====================   
 #普通用户
 # 用户ID -- user_id -- i
 # 用户昵称 -- user_name -- s
 # 用户密码 -- user_pwd -- s
 # 用户手机号 -- user_phone -- s
 # 用户权限 -- user_power -- i
 
 CREATE TABLE user_account
 (user_id INT PRIMARY KEY AUTO_INCREMENT , 
  user_name VARCHAR(32) NOT NULL , 
  user_pwd VARCHAR(32) NOT NULL , 
  user_phone VARCHAR(32) NOT NULL , 
  user_power INT NOT NULL);   
  
  
  
 #================用户表END================   
#物流 tb_car
#  物流公司 car_id
 # 物流公司名称 car_name
  # 物流方式 car_method 
 CREATE TABLE tb_car
 (car_id INT PRIMARY KEY AUTO_INCREMENT,
  car_name VARCHAR(32) NOT NULL , 
  car_method VARCHAR(32) NOT NULL 
   );
   

   
 
  # =================物流表END===================
   
   create table tb_order
   (or_id int primary key auto_increment, 
    or_tm varchar(32) not null , 
     or_uuid varchar(32) not null ,
     or_pany varchar(32) not null , 
     or_money double not null ,
     or_method varchar(32) not null , 
     or_status int not null);

 # ==============订单表END======================  
   
     
   
   # 1. goods_catagory 一对多 即goods_catagory 对应 type_id
   
   ALTER TABLE tb_gds
   ADD CONSTRAINT `fk1` FOREIGN KEY tb_gds(goods_catagory) REFERENCES tb_gds_type(type_id);
   
   
   # 2. goods_id 一对一 即 goods_id 对应 repo_id
    ALTER TABLE tb_repo
   ADD CONSTRAINT `fk2` FOREIGN KEY tb_repo(repo_id) REFERENCES tb_gds(goods_id);
    
    
   # 3. goods_company 商品和公司多对一关系  即 goods_company 和 tb_pany pany_id （商家ID）外键关系
   
    # ALTER TABLE tb_gds
   #ADD CONSTRAINT `fk3` FOREIGN KEY tb_gds(goods_company) REFERENCES tb_car(car_id)
   
   # 因操作不当，导致添加约束错误，删除重新添加
   
   ALTER TABLE tb_gds DROP FOREIGN KEY  `fk2`;
    
   # 重新修改
    ALTER TABLE tb_gds
   ADD CONSTRAINT `fk3` FOREIGN KEY tb_gds(goods_company) REFERENCES tb_pany(pany_id);
         
   # 4. 快递物流 + 商品物流单号     
    ALTER TABLE tb_gds
   ADD CONSTRAINT `fk6` FOREIGN KEY tb_gds(goods_car) REFERENCES tb_car(car_id);
   
   
   # 5 库存表 -- 》 类别表 -- 》商家表 ---》商品表
   
    
    # 1. 连接商品的评论  tb_gds -- goods_id  即 tb_gds_co -- co_id
    ALTER TABLE tb_gds_co
   ADD CONSTRAINT `fk4` FOREIGN KEY tb_gds_co(co_id) REFERENCES tb_gds(goods_id);
   
   
   ALTER TABLE user_account
   ADD CONSTRAINT `fk5` FOREIGN KEY user_account(user_power) REFERENCES tb_power(power_id);
  
  # 物流表 1
    insert into tb_car values(1,'润达公司','润达快递');
    INSERT INTO tb_car VALUES(default,'中通公司','中通快递');
    
  # 促销表 2 
    insert into tb_fast values ('2020-07-06 15:33:26','2020-07-07 23:41:32',100,100,9,1001,2); 
    INSERT INTO tb_fast VALUES ('2020-07-04 16:31:56','2020-07-05 11:23:32',100,100,20,1002,1);
    insert into tb_fast values ('2021-06-08 00:00:00','2021-06-09 00:00:00',3,0,19,1001,0);
  #  类型表 5
    insert into tb_gds_type values(1,'生活类');
    INSERT INTO tb_gds_type VALUES(default,'实用类');
    INSERT INTO tb_gds_type VALUES(DEFAULT,'常用类');
    INSERT INTO tb_gds_type VALUES(DEFAULT,'学习用品');
  # 订单表 6
    insert into tb_order values(1,'2020-07-17 15:54:10','fsap-1a2f-lk9o-s0f5','奥斯利塔香蕉',27.68,'润达快递',0);
    INSERT INTO tb_order VALUES(default,'2020-07-17 15:54:54','s0f5-b4n6-c7m5-f2l2','香飘飘饼干',15.8,'润达快递',0);
    INSERT INTO tb_order VALUES(default,'2020-07-17 15:55:46','v4b7-m8n9-g4j7-kkiu','熊猫饼干',7.56,'京东快递',1);   
  # 商家表 7
    insert into tb_pany values(1,'天猫','一种比较大型的电子商务平台','电子商务'); 
    INSERT INTO tb_pany VALUES(default,'淘宝','比较主流的电子商务市场','电子商务');
    INSERT INTO tb_pany VALUES(default,'京东','大型流行电子商务市场','电子商务');
  # 权限表 8
    insert into tb_power values (1,'普通用户');
    INSERT INTO tb_power VALUES (default,'管理员');
  # 库存表 9
    insert into tb_repo values(1001,100);
    insert into tb_repo values(1002,100);
  # 用户表 10
    insert into user_account values (101,'root','123456','15155557777',2);
  # 商品表 3
    INSERT INTO tb_gds VALUES(1001,12,'微醺鸡尾酒',3,1,1,2); 
    INSERT INTO tb_gds VALUES(default,27,'浪味仙薯卷',5,1,1,1);
  # 商品评论 4
    insert into tb_gds_co values(1,'这个商品真是太棒啦','2020-07-06 22:36:13','chrome','127.0.0.1',1001); 
    INSERT INTO tb_gds_co VALUES(default,'这个商品不是很好，不喜欢','2020-07-07 17:29:32','chrome','127.0.0.1',1001); 
    INSERT INTO tb_gds_co VALUES(DEFAULT,'味道很好，很喜欢，点赞','2020-07-07 17:32:29','chrome','127.0.0.1',1002); 
    