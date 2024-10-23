package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class AnimalWsdlConfig {

    @Bean(name = "animal")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema animalSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("AnimalPort");
        wsdl11Definition.setLocationUri("/ws/animal");
        wsdl11Definition.setTargetNamespace("http://www.ejercicio2/ws/objects");
        wsdl11Definition.setSchema(animalSchema);
        return wsdl11Definition;
    }
}
