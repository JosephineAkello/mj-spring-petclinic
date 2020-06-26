package com.example.mjspringpetclinic.repositories;

import com.example.mjspringpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
