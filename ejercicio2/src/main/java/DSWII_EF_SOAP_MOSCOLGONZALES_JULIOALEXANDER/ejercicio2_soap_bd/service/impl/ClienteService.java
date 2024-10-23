package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.impl;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.exception.NotFoundException;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Clientes;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.repository.ClienteRepository;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.IClienteService;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.util.convert.ClientesConvert;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    private final ClientesConvert convert;

    @Override
    public ejercicio2.ws.objects.GetClientesResponse listarClientes() {
        ejercicio2.ws.objects.GetClientesResponse getClientesResponse = new ejercicio2.ws.objects.GetClientesResponse();
        getClientesResponse.getClientes().addAll(
                convert.mapToClienteswsList(clienteRepository.findAll())
        );
        return getClientesResponse;
    }

    @Override
    public ejercicio2.ws.objects.GetClientesxIdResponse obtenerClientesxID(Integer id) {
        ejercicio2.ws.objects.GetClientesxIdResponse clientesxIdResponse = new ejercicio2.ws.objects.GetClientesxIdResponse();
        Clientes clientes = clienteRepository.findById(id).orElse(null);
        if(clientes == null){
            throw new NotFoundException("El Cliente con ID " +id+ " no existe.");
        }
        clientesxIdResponse.setClientes(
                convert.mapToClientesws(clientes)
        );
        return clientesxIdResponse;
    }

    @Override
    public ejercicio2.ws.objects.PostClientesResponse registrarCliente(ejercicio2.ws.objects.PostClientesRequest request) {
        ejercicio2.ws.objects.PostClientesResponse postClientesResponse = new ejercicio2.ws.objects.PostClientesResponse();
        Clientes newclientes = clienteRepository.save(
                convert.mapToClientes(request.getClientes())
        );
        postClientesResponse.setClientes(convert.mapToClientesws(newclientes));
        return postClientesResponse;
    }
}
