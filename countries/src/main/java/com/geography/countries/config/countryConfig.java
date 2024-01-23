package com.geography.countries.config;

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
public class countryConfig {


    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServletBean(ApplicationContext applicationContext){
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(applicationContext);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>(messageDispatcherServlet,"/geography/*");
    }


    @Bean(name = "GK")
    public DefaultWsdl11Definition defaultWsdl11DefinitionBean(XsdSchema schemaGK){
        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
        defaultWsdl11Definition.setPortTypeName("GKIndicator");
        defaultWsdl11Definition.setSchema(schemaGK);
        defaultWsdl11Definition.setLocationUri("/geography/GK");
        defaultWsdl11Definition.setTargetNamespace("http://www.geography.com/countries");
        return defaultWsdl11Definition;
    }

    @Bean(name = "Culture")
    public DefaultWsdl11Definition defaultWsdl11DefinitionBean2(XsdSchema schemaCulture){
        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
        defaultWsdl11Definition.setPortTypeName("CultureIndicator");
        defaultWsdl11Definition.setSchema(schemaCulture);
        defaultWsdl11Definition.setLocationUri("/geography/Culture");
        defaultWsdl11Definition.setTargetNamespace("http://www.geography.com/countries");
        return defaultWsdl11Definition;
    }

    @Bean
    public XsdSchema schemaGK(){
        return new SimpleXsdSchema(new ClassPathResource("GK.xsd"));
    }

    @Bean
    public XsdSchema schemaCulture(){
        return new SimpleXsdSchema(new ClassPathResource("Culture.xsd"));
    }

}
