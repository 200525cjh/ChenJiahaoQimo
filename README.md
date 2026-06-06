# ChenJiahaoQimo 酒店预定管理系统

本项目是《Java EE开发技术》期末作品，项目名称为 **ChenJiahaoQimo**，项目包名为 **com.chenjiahao.qimo**。系统基于 SSM 框架开发，实现酒店房型查询、在线预定、订单管理、后台房型房间维护、入住退房处理等功能。

## 项目信息

- 学号：202302911200138
- 姓名：陈佳豪
- 项目名称：ChenJiahaoQimo
- 项目包名：com.chenjiahao.qimo
- 系统主题：酒店预定管理系统

## 技术栈

- Java 8
- Spring 5.3.23
- Spring MVC 5.3.23
- MyBatis 3.5.11
- MySQL
- JSP / JSTL / CSS
- Maven
- Tomcat

## 主要功能

### 前台用户

- 用户注册、登录、退出
- 房型列表查询
- 按入住日期、退房日期、房型分类、价格上限筛选房型
- 房型详情查看
- 在线提交预定订单
- 同一账号同一时间段重复预定限制
- 我的订单列表
- 订单详情查看
- 取消未入住订单
- 个人资料维护

### 后台管理员

- 管理员登录
- 房型信息管理
- 房型上下架
- 具体房间管理
- 房间状态维护
- 全部订单查询
- 办理入住
- 办理退房
- 取消异常订单
- 用户账号查看与禁用/启用

## 数据库说明

数据库名称：

```text
chenjiahao_qimo
```

数据库连接配置：

```text
Host: 127.0.0.1
Port: 3306
Username: root
Password: 123456
```

数据库初始化脚本：

```text
src/main/resources/sql/chenjiahao_qimo.sql
```

核心数据表：

- `sys_user`：前台用户表
- `sys_admin`：后台管理员表
- `room_type`：房型表
- `room`：具体房间表
- `booking_order`：预定订单表

## 测试账号

前台用户：

```text
账号：chenjiahao
密码：123456
```

后台管理员：

```text
账号：admin
密码：123456
```

## 运行方式

1. 使用 TablePlus 或其他 MySQL 工具连接数据库。
2. 执行 `src/main/resources/sql/chenjiahao_qimo.sql` 初始化数据库。
3. 使用 IntelliJ IDEA 打开项目。
4. 配置 Tomcat 本地服务器。
5. 将项目以 `war exploded` 方式部署。
6. 建议 Application Context 设置为：

```text
/ChenJiahaoQimo
```

7. 启动 Tomcat 后访问：

```text
http://localhost:8080/ChenJiahaoQimo/rooms
```

后台登录地址：

```text
http://localhost:8080/ChenJiahaoQimo/admin/login
```

## 项目结构

```text
src/main/java/com/chenjiahao/qimo
├── controller      控制层
├── entity          实体类
├── mapper          MyBatis 数据访问层
├── service         业务接口
├── service/impl    业务实现
└── util            工具类

src/main/resources
├── db.properties
├── spring-context.xml
├── spring-mvc.xml
├── spring-mybatis.xml
└── sql/chenjiahao_qimo.sql

src/main/webapp
├── WEB-INF/jsp/admin   后台页面
├── WEB-INF/jsp/user    前台页面
├── WEB-INF/web.xml
└── static/css/style.css
```

## 业务说明

用户选择入住日期和退房日期后，系统会根据房型下具体房间状态和已有订单情况计算可预订库存。提交订单时，系统会再次校验库存，并限制同一账号在同一时间段重复预定。管理员办理入住后，订单状态变为已入住，房间状态变为已入住；办理退房后，订单状态变为已完成，房间状态变为清洁中。

## 说明

本项目用于 Java EE 课程期末作品展示，重点体现 Spring、Spring MVC、MyBatis 与 MySQL 的综合应用。
