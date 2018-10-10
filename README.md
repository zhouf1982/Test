# 测试项目

## 目的说明
在项目中经常需要设计各种逻辑，但是实际上用到的技术条线都是清晰的，为了能更快速的搭建初始环境，特在次记录并使用流行框架设计业务系统的技术框架。

若有内容在使用中有版权（协议）要求，请联系[作者](mailto:zhouf1982@gmail.com)。

## 版本说明

| 版本 | 日期 | 说明 |
| --- | --- | ---|
| 0.0.0.1 | 2018-10-10 | 项目初始 |

## 常用地址记录

- [Maven Repository](https://mvnrepository.com)
- [Spring](http://spring.io)
- [mybatis3](http://www.mybatis.org/mybatis-3/)

## 环境和框架整理

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

## 数据库

> - postgrsql 10

## 项目初始化

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

