package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.util.convert;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Clientes;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Proveedor;
import ejercicio2.ws.objects.Proveedorws;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ProveedorConvert {

    public Proveedor mapToProveedor(ejercicio2.ws.objects.Proveedorws proveedorws) {
        Proveedor proveedor = new Proveedor();
        proveedor.setIdproveedor(proveedorws.getIdproveedor());
        proveedor.setTelefono(proveedorws.getTelefono());
        proveedor.setDireccion(proveedorws.getDireccion());
        proveedor.setEmpresa(proveedorws.getEmpresa());
        proveedor.setRuc(proveedorws.getRuc());
        proveedor.setCorreo(proveedorws.getCorreo());
        proveedor.setRepresentante(proveedorws.getRepresentante());
        return proveedor;
    }

    public ejercicio2.ws.objects.Proveedorws mapToProveedorws(Proveedor proveedor) {
        ejercicio2.ws.objects.Proveedorws proveedorws = new Proveedorws();
        proveedorws.setIdproveedor(proveedor.getIdproveedor());
        proveedorws.setTelefono(proveedor.getTelefono());
        proveedorws.setDireccion(proveedor.getDireccion());
        proveedorws.setEmpresa(proveedor.getEmpresa());
        proveedorws.setRuc(proveedor.getRuc());
        proveedorws.setCorreo(proveedor.getCorreo());
        proveedorws.setRepresentante(proveedor.getRepresentante());
        return proveedorws;
    }

    public List<Proveedor> mapToProveedorList(List<ejercicio2.ws.objects.Proveedorws> proveedorwsList){
        List<Proveedor> proveedorList = new ArrayList<>();
        for (ejercicio2.ws.objects.Proveedorws proveedorws : proveedorwsList){
            proveedorList.add(mapToProveedor(proveedorws));
        }
        return proveedorList;
    }

    public Collection<? extends ejercicio2.ws.objects.Proveedorws> mapToProveedorwsList(List<Proveedor> proveedorList){
        List<ejercicio2.ws.objects.Proveedorws> proveedorwsList = new ArrayList<>();
        for (Proveedor proveedor : proveedorList){
            proveedorwsList.add(mapToProveedorws(proveedor));
        }
        return proveedorwsList;
    }
}
