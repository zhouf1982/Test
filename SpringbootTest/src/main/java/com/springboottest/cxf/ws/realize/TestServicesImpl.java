package com.springboottest.cxf.ws.realize;

import com.springboottest.cxf.ws.TestServices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * @author zhoufeng
 * //import javax.xml.ws.BindingType;
 * //import javax.xml.ws.soap.SOAPBinding;
 * //@BindingType(value = SOAPBinding.SOAP11HTTP_MTOM_BINDING)
 */
//@InInterceptors(interceptors = {""})   http://tempuri.org
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@WebService(serviceName = "TestServices"
        ,portName = "TestServices"
        ,targetNamespace = "http://ws.cxf.springboottest.com/"
         ,endpointInterface = "com.springboottest.cxf.ws.TestServices")
@BindingType(value = SOAPBinding.SOAP12HTTP_BINDING)
@Component
public class TestServicesImpl implements TestServices {

    private static final Logger logger = LogManager.getLogger(TestServicesImpl.class);

    @Override
    public String exec(String in) {
        logger.info("request:" + in);

        String ret = "<test>test</test>";

        logger.info("response:" + ret);

        return ret;
    }
}
