package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service;

public interface IAnimalService {

    ejercicio2.ws.objects.GetAnimalResponse listarAnimal();
    ejercicio2.ws.objects.GetAnimalxIdResponse obtenerAnimalxID(Integer id);
    ejercicio2.ws.objects.PostAnimalResponse registrarAnimal(ejercicio2.ws.objects.PostAnimalRequest request);
}
