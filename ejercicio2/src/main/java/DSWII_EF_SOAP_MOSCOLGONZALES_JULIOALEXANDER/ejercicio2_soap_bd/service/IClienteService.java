package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service;

public interface IClienteService {

    ejercicio2.ws.objects.GetClientesResponse listarClientes();
    ejercicio2.ws.objects.GetClientesxIdResponse obtenerClientesxID(Integer id);
    ejercicio2.ws.objects.PostClientesResponse registrarCliente(ejercicio2.ws.objects.PostClientesRequest request);
}
