package com.example.mjspringpetclinic.service.springdataJpa;

import java.util.HashSet;
import java.util.Set;

import com.example.mjspringpetclinic.model.PetType;
import com.example.mjspringpetclinic.repositories.PetTypeRepository;
import com.example.mjspringpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")

public class PetTypeSDJPAservice implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJPAservice(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();

        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
     petTypeRepository.deleteById(aLong);
    }

}
