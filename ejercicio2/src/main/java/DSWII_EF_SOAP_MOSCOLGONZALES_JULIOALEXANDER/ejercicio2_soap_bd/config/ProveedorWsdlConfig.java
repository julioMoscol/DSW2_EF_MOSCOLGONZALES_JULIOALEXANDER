package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class ProveedorWsdlConfig {

    @Bean(name = "proveedor")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema proveedorSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ProveedorPort");
        wsdl11Definition.setLocationUri("/ws/proveedor");
        wsdl11Definition.setTargetNamespace("http://www.ejercicio2/ws/objects");
        wsdl11Definition.setSchema(proveedorSchema);
        return wsdl11Definition;
    }


}
