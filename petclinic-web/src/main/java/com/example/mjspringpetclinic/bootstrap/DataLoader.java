package com.example.mjspringpetclinic.bootstrap;

import com.example.mjspringpetclinic.model.Owner;
import com.example.mjspringpetclinic.model.PetType;
import com.example.mjspringpetclinic.model.Vet;
import com.example.mjspringpetclinic.service.OwnerService;
import com.example.mjspringpetclinic.service.PetTypeService;
import com.example.mjspringpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        System.out.println("Loaded PetTypes....");

        Owner owner1 = new Owner();
        owner1.setFirstName("Moo");
        owner1.setLastName("Jos");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Maa");
        owner2.setLastName("Akello");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Seee");
        vet1.setLastName("Heee");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Heey");
        vet2.setLastName("Oyoo");

        vetService.save(vet2);

        System.out.println("Load Vets");
    }
}
