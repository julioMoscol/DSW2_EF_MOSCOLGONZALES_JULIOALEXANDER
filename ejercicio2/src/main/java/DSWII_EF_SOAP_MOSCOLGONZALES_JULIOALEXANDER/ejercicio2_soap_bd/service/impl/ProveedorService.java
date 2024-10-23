package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.impl;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.exception.NotFoundException;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Proveedor;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.repository.ProveedorRepository;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.IProveedorService;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.util.convert.ProveedorConvert;
import ejercicio2.ws.objects.GetProveedorResponse;
import ejercicio2.ws.objects.GetProveedorxIdResponse;
import ejercicio2.ws.objects.PostProveedorRequest;
import ejercicio2.ws.objects.PostProveedorResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProveedorService implements IProveedorService {

    private final ProveedorRepository proveedorRepository;
    private final ProveedorConvert convert;

    @Override
    public GetProveedorResponse listarProveedor() {
        ejercicio2.ws.objects.GetProveedorResponse getProveedorResponse = new ejercicio2.ws.objects.GetProveedorResponse();
        getProveedorResponse.getProveedor().addAll(
                convert.mapToProveedorwsList(proveedorRepository.findAll())
        );
        return getProveedorResponse;
    }

    @Override
    public GetProveedorxIdResponse obtenerProveedorxID(Integer id) {
        ejercicio2.ws.objects.GetProveedorxIdResponse proveedorxIdResponse = new ejercicio2.ws.objects.GetProveedorxIdResponse();
        Proveedor proveedor = proveedorRepository.findById(id).orElse(null);
        if(proveedor == null){
            throw new NotFoundException("El Proveedor con ID " +id+ " no existe.");
        }
        proveedorxIdResponse.setProveedor(
                convert.mapToProveedorws(proveedor)
        );
        return proveedorxIdResponse;
    }

    @Override
    public PostProveedorResponse registrarProveedor(PostProveedorRequest request) {
        ejercicio2.ws.objects.PostProveedorResponse postProveedorResponse = new ejercicio2.ws.objects.PostProveedorResponse();
        Proveedor newproveedor = proveedorRepository.save(
                convert.mapToProveedor(request.getProveedor())
        );
        postProveedorResponse.setProveedor(convert.mapToProveedorws(newproveedor));
        return postProveedorResponse;
    }
}
