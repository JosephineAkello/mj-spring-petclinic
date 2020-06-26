package com.example.mjspringpetclinic.service.springdataJpa;


import java.util.HashSet;
import java.util.Set;

import com.example.mjspringpetclinic.model.Vet;
import com.example.mjspringpetclinic.repositories.VetRepository;
import com.example.mjspringpetclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetsSDJPAservice implements VetService {

    private final VetRepository vetRepository;


    public VetsSDJPAservice(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElseGet(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
       vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    vetRepository.deleteById(aLong);
    }
}
