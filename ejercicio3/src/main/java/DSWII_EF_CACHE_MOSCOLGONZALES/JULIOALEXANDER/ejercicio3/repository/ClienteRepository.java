package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.repository;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query(value = "SELECT * FROM cliente WHERE dni LIKE ':dni%';", nativeQuery = true)
    List<Cliente> obtenerClientePorDni(@Param("dni") Integer dni);
}
