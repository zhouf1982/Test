# JavaTest 

## 版本说明

| 版本 | 日期 | 说明 |
| --- | --- | ---|
| 0.0.0.1 | 2018-10-10 | JavaTest 项目初始 | 
| 0.0.0.2 | 2028-10-23 | 开发环境（svn/git和maven的项目导入） |

## 常用地址记录

- [Maven Repository](https://mvnrepository.com)
- [Spring](http://spring.io)
- [mybatis3](http://www.mybatis.org/mybatis-3/)

## JavaTest

### 环境和框架整理

- 推荐使用jdk 11
- spring 5
- spring 5 mvc
- axis2 1.7.8
- mybatis 3.4.6
- mybatis-spring 1.3.2
- quartz 2.2.1
- 推荐使用Gson处理json数据 Gson 2.8.2
- 推荐使用dom4j处理xml数据 dom4j 1.6.1
- 推荐使用log4j2处理日志 log4j2 2.10.0
- 必须进行junit测试 junit 4.12

### 数据库

- postgrsql 10

> Java测试项目建表语句：JavaTest/Design/plsql_scripts/init.sql

### 项目初始化

- 下载项目或是用命令行创建分支
> git clone --origin Test https://github.com/zhouf1982/Test.git
- 复制并打开项目
> ./JavaTest
- 配置maven环境
- 如果使用IDE请进行相应配置
- 使用pom.xml刷新maven仓库
> maven国内镜像(阿里云)请在settings.xml中配置mirrors子节点
``` xml

<mirror>
    <id>nexus-aliyun</id>
    <mirrorOf>*</mirrorOf>
    <name>Nexus aliyun</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
</mirror>

```

#### maven项目，git/svn上，使用intellij idea的初始

- 使用git/svn客户端clone/checkOut
- 使用idea的import
- 选择maven项目导入
- 设置 Environment settings...
- 设置各种目录结构及必要的包（axis2的jar和mar）等，如果有需要的话

#### 设置运行项

- tomcat: 配置
- mybatis: generate-resources -e

#### git更新文件例外处理

- 说明： 因为有些本地设置不需要同步到git，为了方便处理，上传了exclude文件，请替换 Test/.git/info/exlude文件

> $ cp exclude .git/info/exclude
