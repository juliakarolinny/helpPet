package com.helpPet.helpPet.Controller;

import com.helpPet.helpPet.Entity.Animal;
import com.helpPet.helpPet.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Animal")
public class AnimalController {
        @Autowired
        AnimalService animalService;

        @GetMapping
        public List<Animal> mostrar() {
            return animalService.mostrar();
        }

}
