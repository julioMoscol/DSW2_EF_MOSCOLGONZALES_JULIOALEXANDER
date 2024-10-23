package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Proveedor;

import java.util.List;

public interface IProveedorService {

    List<Proveedor> obtenerProveedorXRuc(Integer ruc);

    Proveedor registarProveedor(Proveedor proveedor);

    Proveedor actualizarProveedor(Proveedor proveedor);

    void eliminarProveedor(Integer id);

    void eliminarCache();
}
