package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Animal;

import java.util.List;

public interface IAnimalService {

    List<Animal> obtenerAnimalXNombre(String nombre);

    Animal registarAnimal(Animal animal);

    Animal actualizarAnimal(Animal animal);

    void eliminarAnimal(Integer id);

    void eliminarCache();
}
