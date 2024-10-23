package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.util.convert;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Animal;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class AnimalConvert {

    public Animal mapToAnimal(ejercicio2.ws.objects.Animalws animalws) {
        Animal animal = new Animal();
        animal.setIdanimal(animalws.getIdanimal());
        animal.setDescanimal(animalws.getDescanimal());
        return animal;
    }

    public ejercicio2.ws.objects.Animalws mapToAnimalws(Animal animal) {
        ejercicio2.ws.objects.Animalws animalws = new ejercicio2.ws.objects.Animalws();
        animalws.setIdanimal(animal.getIdanimal());
        animalws.setDescanimal(animal.getDescanimal());
        return animalws;
    }

    public List<Animal> mapToAnimalList(List<ejercicio2.ws.objects.Animalws> animalwsList){
        List<Animal> animalList = new ArrayList<>();
        for (ejercicio2.ws.objects.Animalws animalws : animalwsList){
            animalList.add(mapToAnimal(animalws));
        }
        return animalList;
    }

    public Collection<? extends ejercicio2.ws.objects.Animalws> mapToAnimalwsList(List<Animal> animalList){
        List<ejercicio2.ws.objects.Animalws> animalwsList = new ArrayList<>();
        for (Animal animal : animalList){
            animalwsList.add(mapToAnimalws(animal));
        }
        return animalwsList;
    }
}
