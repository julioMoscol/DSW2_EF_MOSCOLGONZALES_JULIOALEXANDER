package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.endpoint;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AnimalEndPoint {

    private static final String NAMESPACE_URI = "http://www.ejercicio2/ws/objects";

    @Autowired
    private IAnimalService iAnimalService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAnimalRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.GetAnimalResponse getAnimal(@RequestPayload ejercicio2.ws.objects.GetAnimalRequest request){
        return iAnimalService.listarAnimal();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAnimalxIdRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.GetAnimalxIdResponse getAnimal(@RequestPayload ejercicio2.ws.objects.GetAnimalxIdRequest request){
        return iAnimalService.obtenerAnimalxID(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postAnimalRequest")
    @ResponsePayload
    public ejercicio2.ws.objects.PostAnimalResponse postAnimal(@RequestPayload ejercicio2.ws.objects.PostAnimalRequest request){
        return iAnimalService.registrarAnimal(request);
    }
}
