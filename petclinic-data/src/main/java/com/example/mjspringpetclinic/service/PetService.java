package com.example.mjspringpetclinic.service;

import java.util.Set;

import com.example.mjspringpetclinic.model.Owner;
import com.example.mjspringpetclinic.model.Pet;

public interface PetService {

    Pet findbyId(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
