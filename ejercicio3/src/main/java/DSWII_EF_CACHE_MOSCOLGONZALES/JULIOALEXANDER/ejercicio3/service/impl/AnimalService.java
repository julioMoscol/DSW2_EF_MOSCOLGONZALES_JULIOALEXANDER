package DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service.impl;

import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.model.Animal;
import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.repository.AnimalRepository;
import DSWII_EF_CACHE_MOSCOLGONZALES.JULIOALEXANDER.ejercicio3.service.IAnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AnimalService implements IAnimalService {


    private final AnimalRepository animalRepository;

    @Cacheable(value = "animalNombre", key="nombre")
    @Override
    public List<Animal> obtenerAnimalXNombre(String nombre) {
        return animalRepository.obtenerAnimalPorNombre(nombre);
    }

    @Override
    public Animal registarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @CachePut(value = "animalNombre", key = "#animal.idanimal")
    @Override
    public Animal actualizarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @CacheEvict(value = "animalNombre", allEntries = true)
    @Override
    public void eliminarAnimal(Integer id) {

    }

    @CacheEvict(value = {"animalNombre"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }


}
