package com.javetest.mybatis.core.sqlsession;

import com.javetest.mybatis.core.config.Function;
import com.javetest.mybatis.core.config.MapperBean;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 读取与解析配置信息，并返回处理后的Environment
 */
public class MyConfiguration {
    private static ClassLoader loader = ClassLoader.getSystemClassLoader();

    public Connection build(String resource) {
        try {
            InputStream stream = loader.getResourceAsStream(resource);
            SAXReader reader = new SAXReader();
            Document document = reader.read(stream);
            Element root = document.getRootElement();
            return evalDataSource(root);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("error occured while evaling xml " + resource);
        }
    }

    private Connection evalDataSource(Element node) throws ClassNotFoundException{
        if (!node.getName().equals("database")) {
            throw new RuntimeException("root should be <database>");
        }

        String driverClassName = null;
        String url = null;
        String username = null;
        String password= null;

        for (Object item : node.elements("property")
             ) {
            Element i = (Element) item;
            String value = getValue(i);
            String name = i.attributeValue("name");
            if (name == null || value == null) {
                throw new RuntimeException("[database]: <property> should contain name and value");
            }
            switch (name) {
                case "url" : url = value; break;
                case "username" : username = value; break;
                case "password" : password = value; break;
                case "driverClassName" : driverClassName = value; break;
                default: throw new RuntimeException("[database]:<property> unknown name");
            }
        }

        Class.forName(driverClassName);
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    //获取property属性的值，如果有value值，则读取, 没有设置value，则读取内容
    private String getValue(Element node) {
        return node.hasContent() ? node.getText() : node.attributeValue("value");
    }

    @SuppressWarnings("rawtypes")
    public MapperBean readMapper(String path) {
        MapperBean mapper = new MapperBean();

        try {
            InputStream stream = loader.getResourceAsStream(path);
            SAXReader reader = new SAXReader();
            Document document = reader.read(stream);
            Element root = document.getRootElement();

            mapper.setInterfaceName(root.attributeValue("nameSpace").trim());
            List<Function> list = new ArrayList<Function>();
            for (Iterator rootIter = root.elementIterator(); rootIter.hasNext();
                 ) {
                Function fun = new Function();
                Element element = (Element)rootIter.next();
                String sqltype = element.getName().trim();
                String funcName = element.attributeValue("id").trim();
                String sql = element.getText().trim();
                String resultType = element.attributeValue("resultType").trim();

                fun.setSqltype(sqltype);
                fun.setFuncName(funcName);
                Object newInstance = null;

                try {
                    newInstance = Class.forName(resultType).newInstance();
                } catch (InstantiationException |
                        IllegalAccessException |
                        ClassNotFoundException
                        e) {
                    e.printStackTrace();
                }

                fun.setResultType(newInstance);
                fun.setSql(sql);

                list.add(fun);
            }

            mapper.setList(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapper;
    }
}
