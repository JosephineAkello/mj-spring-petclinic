package com.example.mjspringpetclinic.service;

import java.util.Set;

import com.example.mjspringpetclinic.model.Owner;
import com.example.mjspringpetclinic.model.Vet;

public interface VetService {

    Vet findbyId(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
