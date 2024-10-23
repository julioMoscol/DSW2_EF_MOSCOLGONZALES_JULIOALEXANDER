package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.repository;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, String> {

    @Query(value = "SELECT * FROM animal WHERE descanimal = :nombre", nativeQuery = true)
    List<Animal> obtenerAnimalPorNombre(@Param("nombre") String nombre);
}
