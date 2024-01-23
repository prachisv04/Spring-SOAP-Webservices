package com.product.crud.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
@EnableWs
public class ProductSOAPConfiguration {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> registrationBean(ApplicationContext context){
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(context);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>(messageDispatcherServlet,"/product/*");

    }

    @Bean(name = "products")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema){
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("ProductIndicator");
        wsdl.setTargetNamespace("http://www.product.com/crud/model");
        wsdl.setLocationUri("/product/");
        wsdl.setSchema(schema);
        return wsdl;
    }

    @Bean
    public XsdSchema schema(){
        return new SimpleXsdSchema(new ClassPathResource("Product.xsd"));
    }


}
