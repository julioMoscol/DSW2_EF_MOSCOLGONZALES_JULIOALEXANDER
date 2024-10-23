package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.endpoint;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class ClientesEndPoint {

    private static final String NAMESPACE_URI = "http://www.ejercicio2/ws/objects";

    @Autowired
    private IClienteService iclienteService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClientesRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.GetClientesResponse getClientes(@RequestPayload ejercicio2.ws.objects.GetClientesRequest request){
        return iclienteService.listarClientes();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClientesxIdRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.GetClientesxIdResponse getClientesxId(@RequestPayload ejercicio2.ws.objects.GetClientesxIdRequest request){
        return iclienteService.obtenerClientesxID(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postClientesRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.PostClientesResponse postClientes(@RequestPayload ejercicio2.ws.objects.PostClientesRequest request){
        return iclienteService.registrarCliente(request);
    }
}
