###效果预览：
![image](https://github.com/user-attachments/assets/5a167a27-7421-4778-8b8a-2704d7bbb60f)
![image](https://github.com/user-attachments/assets/50fa9884-b357-4d6f-9c1d-69daf8e16aac)
![image](https://github.com/user-attachments/assets/d1af3421-ef3b-47f2-8fc6-8b17459925a0)

###使用说明：

首先，执行根目录下的db.sql文件，在本地数据库创建springboot482k3表。连接数据库。

接下来，打开项目文件夹。
在src\main\resources\application.yml中编辑
											
	 url: jdbc:mysql://127.0.0.1:3306/springboot482k3?useUnicode=true&characterEncoding=utf-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
        username: root
        password: 123456 （数据库密码）
        
启动项目后，在浏览器中打开：（推荐使用谷歌浏览器）

后台地址
http://localhost:8080/springboot482k3/admin/dist/index.html

前台地址：
http://localhost:8080/springboot482k3/front/index.html

默认用户如下：

管理员  abo 密码 abo

用户1 123456

商家2 123456


