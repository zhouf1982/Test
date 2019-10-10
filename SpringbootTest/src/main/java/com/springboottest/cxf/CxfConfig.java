package com.springboottest.cxf;

import com.springboottest.cxf.ws.TestServices;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author zhoufeng
 */
@Configuration
public class CxfConfig {

    private TestServices testServices;

    @Autowired
    public void setTestServices(TestServices testServices) {
        this.testServices = testServices;
    }

    @SuppressWarnings("all")
    @Bean
    public ServletRegistrationBean wsServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new CXFServlet()
                , "/soap/*");

        return bean;
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint budgetServices() {

        EndpointImpl endpoint = new EndpointImpl(springBus(), testServices);

        endpoint.publish("/services");

        return endpoint;
    }
}
