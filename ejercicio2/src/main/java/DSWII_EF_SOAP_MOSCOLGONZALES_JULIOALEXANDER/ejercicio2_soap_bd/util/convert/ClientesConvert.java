package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.util.convert;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Clientes;
import ejercicio2.ws.objects.Clientesws;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ClientesConvert {

    public Clientes mapToClientes(ejercicio2.ws.objects.Clientesws clientesws) {
        Clientes clientes = new Clientes();
        clientes.setIdcliente(clientesws.getIdclientes());
        clientes.setNombres(clientesws.getNomclientes());
        clientes.setApellidos(clientesws.getApeclientes());
        clientes.setDni(clientesws.getDniclientes());
        clientes.setTelefono(clientesws.getTelfclientes());
        clientes.setCorreo(clientesws.getCorrclientes());
        clientes.setDireccion(clientesws.getDirclientes());
        return clientes;
    }

    public ejercicio2.ws.objects.Clientesws mapToClientesws(Clientes clientes) {
        ejercicio2.ws.objects.Clientesws clientesws = new Clientesws();
        clientesws.setIdclientes(clientes.getIdcliente());
        clientesws.setNomclientes(clientes.getNombres());
        clientesws.setApeclientes(clientes.getApellidos());
        clientesws.setDniclientes(clientes.getDni());
        clientesws.setTelfclientes(clientes.getTelefono());
        clientesws.setCorrclientes(clientes.getCorreo());
        clientesws.setDirclientes(clientes.getDireccion());
        return clientesws;
    }

    public List<Clientes> mapToClientesList(List<Clientesws> clienteswsList){
        List<Clientes> clientesList = new ArrayList<>();
        for (Clientesws clientesws : clienteswsList){
            clientesList.add(mapToClientes(clientesws));
        }
        return clientesList;
    }

    public Collection<? extends Clientesws> mapToClienteswsList(List<Clientes> clientesList){
        List<Clientesws> clienteswsList = new ArrayList<>();
        for (Clientes clientes : clientesList){
            clienteswsList.add(mapToClientesws(clientes));
        }
        return clienteswsList;
    }

}
