package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service;

public interface IProveedorService {

    ejercicio2.ws.objects.GetProveedorResponse listarProveedor();
    ejercicio2.ws.objects.GetProveedorxIdResponse obtenerProveedorxID(Integer id);
    ejercicio2.ws.objects.PostProveedorResponse registrarProveedor(ejercicio2.ws.objects.PostProveedorRequest request);
}
