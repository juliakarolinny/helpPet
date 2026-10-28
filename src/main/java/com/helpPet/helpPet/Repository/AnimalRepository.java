package com.helpPet.helpPet.Repository;

import com.helpPet.helpPet.Entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
