package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.endpoint;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.IClienteService;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProveedorEndPoint {

    private static final String NAMESPACE_URI = "http://www.ejercicio2/ws/objects";

    @Autowired
    private IProveedorService iproveedorService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProveedorRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.GetProveedorResponse getProveedor(@RequestPayload ejercicio2.ws.objects.GetProveedorRequest request){
        return iproveedorService.listarProveedor();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProveedorxIdRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.GetProveedorxIdResponse getProveedorxId(@RequestPayload ejercicio2.ws.objects.GetProveedorxIdRequest request){
        return iproveedorService.obtenerProveedorxID(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postProveedorRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.PostProveedorResponse postProveedor(@RequestPayload ejercicio2.ws.objects.PostProveedorRequest request){
        return iproveedorService.registrarProveedor(request);
    }
}
