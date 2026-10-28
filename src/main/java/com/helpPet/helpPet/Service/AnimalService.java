package com.helpPet.helpPet.Service;

import com.helpPet.helpPet.Entity.Animal;
import com.helpPet.helpPet.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> mostrar() {
        return animalRepository.findAll();
    }
}

