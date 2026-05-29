### 效果预览：
![image](https://github.com/user-attachments/assets/5a167a27-7421-4778-8b8a-2704d7bbb60f)
![image](https://github.com/user-attachments/assets/50fa9884-b357-4d6f-9c1d-69daf8e16aac)
![image](https://github.com/user-attachments/assets/d1af3421-ef3b-47f2-8fc6-8b17459925a0)

### 使用说明：

需要的**系统环境**：IDEA，JDK1.8，MySQL，Maven

首先，执行根目录下的**db.sql文件**，在本地数据库创建springboot482k3表。连接数据库。

接下来，打开项目文件夹。
**在src\main\resources\application.yml中编辑**
											
	 url: jdbc:mysql://127.0.0.1:3306/springboot482k3?useUnicode=true&characterEncoding=utf-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
        username: root
        password: 123456 （数据库密码）
        
启动项目后，**在浏览器中打开**：（推荐使用谷歌浏览器）

后台地址
http://localhost:8080/springboot482k3/admin/dist/index.html

前台地址：
http://localhost:8080/springboot482k3/front/index.html

**默认用户如下：**

管理员  abo 密码 abo

用户1 123456

商家2 123456


**技术栈：**

前端：vue,js,css,html

后端：SpringBoot,Mybatis


**前台功能：**

1、首页推荐信息，商品信息推荐，商品信息展示。

2、商品信息：商品信息分类浏览，商品名称、类别搜索。用户收藏商品，点赞，踩，添加到购物车，立即购买，评论商品。

3、个人中心：查询用户姓名、性别、手机、邮箱、身份证、余额等信息，进行更新，充值操作。

4、我的订单：按照状态查询订单，分为未支付、已支付、已发货、已完成、已退款、已取消等。

5、我的地址：通过列表查询联系人、手机号码、地址、默认状态等信息，进行添加，修改，删除操作。

6、我的收藏：根据商品名称获取用户收藏商品，方便再次浏览购买。

7、客服：用户在线资询，反馈问题。

8、购物车：通过列表获取购买商品、价格、数量、总价等信息，进行数量调整，删除，购买等操作。

**管理后台功能：**

1、个人中心，修改密码，个人信息更新修改。

2、用户管理：通过列表获取用户账号、姓名、性别、手机、邮箱、身份证等信息，进行添加，修改，删除操作

3、商家管理：通过列表获取账号、商家名称、性别、手机、邮箱、身份证等信息，进行添加，修改，删除操作。

4、商品分类：通过列表获取类别等信息，进行增加，修改，删除操作。

5、商品信息管理：通过列表获取商品名称、类别、月销售量、图片、账号、商家名称、价格、审核回复、审核状态等信息，进行添加，修改，删除，审核，查看评论操作。

6、我的收藏管理：通过列表获取收藏名称、收藏图片等信息，进行添加，删除，修改操作。

7、轮播图管理：管理员通过列表获取，名称，值等信息，进行修改或删除操作。

8、客服管理：在线答复用户提出的问题。

9、订单管理：用户支付订单，退款，收货。商家发货。


