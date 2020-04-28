package com.example.mjspringpetclinic.service;

import java.util.Set;

import com.example.mjspringpetclinic.model.Owner;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findbyId(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
