package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.repository;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
