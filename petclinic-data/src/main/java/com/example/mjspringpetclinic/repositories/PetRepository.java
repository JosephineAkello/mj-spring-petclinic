package com.example.mjspringpetclinic.repositories;

import com.example.mjspringpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
