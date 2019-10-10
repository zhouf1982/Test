# 基于SpringbootTest 项目的调整方式

## 版本说明

| 版本 | 日期 | 说明| 
| -- | -- | -- |
| 0.0.0.1 | 2019-10-10  | 初始化 |

## 项目的获取

- 下载项目或是用命令行创建分支
> git clone --origin Test https://github.com/zhouf1982/Test.git

- 复制SpringbootTest项目
- 删除.git文件夹
- 修改项目名称

## 项目的初始

### 调整业务数据库的连接

> 文件位置:/SpringbootTest/src/main/resources/application.properties

### mybatis-generator的使用
> 该工具可直接生成mybatis的mapper和对应的bean
> 文件位置:/SpringbootTest/src/main/resources/generatorConfig.xml
- 修改classPathEntry节点对应的jdbc驱动位置
- 修改context节点对应的解析类型
- 修改jdbcConnection节点对应的数据库配置
- 修改javaModelGenerator\sqlMapGenerator\javaClientGenerator对应的targetpackage的位置
- 修改table，即需要处理的表
- 执行命令（或者在IDE中运行：mvn mybatis-generator:generate -e
- 在对应目录下查看运行结果

### 项目配置关键点说明
> 根包下面的Application.class
- @MapperScan为mybatis的mapper扫描位置，注意修改包名后及时调整
- 完成以上内容后进行环境测试，文件示例：ApplicationTests.class

### webservice发布
