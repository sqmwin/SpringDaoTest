[TOC]

---

# 4. Spring与Dao

-   一部分是JDBC模板的使用,是Spring 所使用的操作数据库的技术之一； 另一部分则为 Spring 对于事务的管理
-   Spring 与 Dao 部分，是Spring 的两大核心技术 IoC 与 AOP 的典型应用体现
    -   对于 JDBC 模板的使用，是 IoC 的应用，是将 JDBC 模板对象注入给了Dao 层的实现类
    -   对于 Spring 的事务管理，是 AOP 的应用，将事务作为切面织入到了 Service 层的业务方法中

## 4.1 Spring与JDBC模板

-   **JdbcTemplate**:
    -   为了避免直接使用 JDBC 而带来的复杂且冗长的代码，Spring 提供了一个强有力的模板类---JdbcTemplate来简化 JDBC操作
    -   **数据源 DataSource对象**与**模板 JdbcTemplate 对象**均可通过 **Bean** 的形式定义在配置文件中，充分发挥了依赖注入的威力

### 4.1.1 导 入jar包

1.  Spring的基本包与数据库驱动jar包(mysql-connector-java.5.1.45.jar)

2.  Spring的JDBC包

    -   spring-jdbc-x.x.x.RELEASE.jar

3.  Spring的事务包Spring Transaction

    -   spring-tx-x.x.x.RELEASE.jar

4.  maven中的pom配置

    -   ```xml
        spirng...

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.45</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-jdbc</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-tx</artifactId>
            <version>5.0.2.RELEASE</version>
        </dependency>
        ```

### 4.1.2     搭建测试环境

1.	**定义实体类 User**
  2.**定义数据库及表**
  3.**定义 IUserDao**
  4.**初步定义 UserDaoImpl**
  5.**定义 IUserService**
  6.**定义 UserServiceImpl**
  7.**定义测试类 MyTest**

### 4.1.3 数据源的配置

#### Spring 默认的数据源 DriverManagerDataSource

#### DBCP数据源BasicDataSource

#### C3P0 数据源ComboPooledDataSource

### 4.1.4 从属性文件读取数据库连接信息

1.  \<bean/>方式-使用 class为 PropertyPlaceholderConfigurer
2.  \<context:property-placeholder/>方式

### 4.1.5 配置JDBC模板

### 4.1.6 Dao实现类继承JdbcDaoSupport类

### 4.1.7 对db的增删改操作

### 4.1.8 对db的查询操作

1.  简单对象查询
2.  自定义对象查询

### 4.1.9 注意:Jdbc模板是多例的

## 4.2 Spring的事务管理

### 4.2.1 Spring事务管理API

1.  事务管理器接口
    1.  常用的两个实现类
    2.  Spring的回滚方式
    3.  回顾错误与异常
2.  事务定义接口
    1.  定义了五个事务隔离级别常量
    2.  定义了七个事务传播行为常量
    3.  定义了默认事务超时时限

### 4.2.2. 程序举例环境搭建

1.  创建数据库表
2.  创建实体类
3.  定义dao接口
4.  定义dao实现类
5.  定义异常类
6.  定义Service接口
7.  定义Service的实现类
8.  Spring配置文件中添加最全约束
9.  修改Spring配置文件内容
10.  定义测试类

### 4.2.3 使用Spring的事务代理工厂管理事务

1.  复制项目
2.  导入jar包
3.  在容器中添加事务管理器 DataSourceTransactionManager
4.  在容器中添加事务代理 TransactionProxyFactoryBean
5.  修改测试类

### 4.2.4 使用Spring的事务注解管理事务

1.  复制项目
2.  在容器中添加事务管理器
3.  在 Service实现类方法上添加注解
4.  修改配置文件内容
5.  修改测试类

### 4.2.5 使用 AspectJ的AOP 配置管理事务（重点)

1.  复制项目
2.  导入jar包
3.  在容器中添加事务管理器
4.  配置事务通知
5.  配置顾问
6.  修改测试类

