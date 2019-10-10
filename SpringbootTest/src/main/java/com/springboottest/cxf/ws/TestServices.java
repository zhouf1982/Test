package com.springboottest.cxf.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author zhoufeng
 */
@WebService(name = "TestServices",
            targetNamespace = "http://ws.cxf.springboottest.com/")
public interface TestServices {
    /** 通用接口，用于平台服务的补充
     * @param in 一个请求
     * @return 根据请求内容返回相关内容
     */
    @WebMethod(operationName="exec")
    @WebResult(name = "ret", targetNamespace = "http://ws.cxf.springboottest.com/")
    String exec(@WebParam(name = "in") String in);
}
