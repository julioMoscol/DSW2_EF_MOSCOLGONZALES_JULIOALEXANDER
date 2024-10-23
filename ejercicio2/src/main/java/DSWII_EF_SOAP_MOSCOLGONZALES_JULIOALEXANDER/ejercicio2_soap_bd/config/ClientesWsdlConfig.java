package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class ClientesWsdlConfig {

    @Bean(name = "clientes")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema clienteSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ClientesPort");
        wsdl11Definition.setLocationUri("/ws/clientes");
        wsdl11Definition.setTargetNamespace("http://www.ejercicio2/ws/objects");
        wsdl11Definition.setSchema(clienteSchema);
        return wsdl11Definition;
    }


}
