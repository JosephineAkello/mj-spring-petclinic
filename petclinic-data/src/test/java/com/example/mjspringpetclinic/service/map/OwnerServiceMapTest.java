package com.example.mjspringpetclinic.service.map;

import java.util.Set;

import com.example.mjspringpetclinic.model.Owner;
import com.example.mjspringpetclinic.service.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    final Long ownerId = 1L;
    final String lastName = "MJ";

    @BeforeEach
    void setUp() {
       ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(), new PetServiceMap());

       ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Owner owner = ownerServiceMap.findById(ownerId);

        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        long id = 2L;
        Owner owner2 = Owner.builder().id(id).build();

        Owner savedOwner = ownerServiceMap.save(owner2);

        assertEquals(ownerId, savedOwner.getId());
    }


    @Test
    void saveNoId() {
        long id = 2L;
        Owner savedOwner = ownerServiceMap.save(Owner.builder().build());

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void findById() {

        Set<Owner> ownerSet = ownerServiceMap.findAll();

        assertEquals(1,ownerSet.size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));

        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0, ownerServiceMap.findAll().size());
    }

    @Test
    void findByLastName() {

        Owner mj = ownerServiceMap.findByLastName(lastName);

        assertNotNull(mj);

        assertEquals(ownerId, mj.getId());
    }

    @Test
    void findByLastNameNotFound() {

        Owner mj = ownerServiceMap.findByLastName("foo");

        assertNotNull(mj);

    }
}
