package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.repository;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

    @Query(value = "SELECT * FROM proveedor WHERE ruc = :ruc", nativeQuery = true)
    List<Proveedor> obtenerProveedorPorRuc(@Param("ruc") Integer ruc);
}
