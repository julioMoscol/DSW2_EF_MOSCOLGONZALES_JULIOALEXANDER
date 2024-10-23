package DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.impl;

import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.exception.NotFoundException;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.model.Animal;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.repository.AnimalRepository;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.service.IAnimalService;
import DSWII_EF_SOAP_MOSCOLGONZALES_JULIOALEXANDER.ejercicio2_soap_bd.util.convert.AnimalConvert;
import ejercicio2.ws.objects.GetAnimalResponse;
import ejercicio2.ws.objects.GetAnimalxIdResponse;
import ejercicio2.ws.objects.PostAnimalRequest;
import ejercicio2.ws.objects.PostAnimalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AnimalService implements IAnimalService {

    private final AnimalRepository animalRepository;
    private final AnimalConvert convert;

    @Override
    public GetAnimalResponse listarAnimal() {
        GetAnimalResponse getAnimalResponse = new GetAnimalResponse();
        getAnimalResponse.getAnimal().addAll(
                convert.mapToAnimalwsList(animalRepository.findAll())
        );
        return getAnimalResponse;
    }

    @Override
    public GetAnimalxIdResponse obtenerAnimalxID(Integer id) {
        GetAnimalxIdResponse animalxIdResponse = new GetAnimalxIdResponse();
        Animal animal = animalRepository.findById(id).orElse(null);
        if (animal == null){
            throw new NotFoundException("El Animal con ID "+id+" no existe.");
        }
        animalxIdResponse.setAnimal(
                convert.mapToAnimalws(animal)
        );
        return animalxIdResponse;
    }

    @Override
    public PostAnimalResponse registrarAnimal(PostAnimalRequest request) {
        PostAnimalResponse postAnimalResponse = new PostAnimalResponse();
        Animal newanimal = animalRepository.save(
                convert.mapToAnimal(request.getAnimal())
        );
        postAnimalResponse.setAnimal(convert.mapToAnimalws(newanimal));
        return postAnimalResponse;
    }
}
