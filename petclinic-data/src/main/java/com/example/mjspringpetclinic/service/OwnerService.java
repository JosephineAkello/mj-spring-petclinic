package com.example.mjspringpetclinic.service;

import java.util.Set;

import com.example.mjspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
