package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service.impl;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Proveedor;
import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.repository.ProveedorRepository;
import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service.IProveedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProveedorService implements IProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Cacheable(value = "proveedorRuc", key="ruc")
    @Override
    public List<Proveedor> obtenerProveedorXRuc(Integer ruc) {
        return proveedorRepository.obtenerProveedorPorRuc(ruc);
    }

    @Override
    public Proveedor registarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @CachePut(value = "proveedorRuc", key = "#proveedor.idproveedor")
    @Override
    public Proveedor actualizarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @CacheEvict(value = "proveedorRuc", allEntries = true)
    @Override
    public void eliminarProveedor(Integer id) {

    }

    @CacheEvict(value = "proveedorRuc", allEntries = true)
    @Override
    public void eliminarCache() {

    }
}
