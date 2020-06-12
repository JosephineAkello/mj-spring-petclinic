package com.example.mjspringpetclinic.bootstrap;

import java.time.LocalDateTime;

import com.example.mjspringpetclinic.model.Owner;
import com.example.mjspringpetclinic.model.Pet;
import com.example.mjspringpetclinic.model.PetType;
import com.example.mjspringpetclinic.model.Speciality;
import com.example.mjspringpetclinic.model.Vet;
import com.example.mjspringpetclinic.service.OwnerService;
import com.example.mjspringpetclinic.service.PetTypeService;
import com.example.mjspringpetclinic.service.SpecialityService;
import com.example.mjspringpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if(count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

        System.out.println("Loaded PetTypes....");

        Owner owner1 = new Owner();
        owner1.setFirstName("Moo");
        owner1.setLastName("Jos");
        owner1.setAddress("12345 Muhoroni");
        owner1.setCity("Muhoroni");
        owner1.setTelephone("071234567");

        Pet mjsPet = new Pet();
        mjsPet.setPetType(saveDogPetType);
        mjsPet.setOwner(owner1);
        mjsPet.setBirthdate(LocalDateTime.now());
        mjsPet.setName("Bosco");
        owner1.getPets().add(mjsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Maa");
        owner2.setLastName("Akello");
        owner2.setAddress("1111 Kisumu");
        owner2.setCity("Kisumu");
        owner2.setTelephone("072255554");

        Pet aksPet = new Pet();
        aksPet.setName("Lovely");
        aksPet.setOwner(owner2);
        aksPet.setBirthdate(LocalDateTime.now());
        aksPet.setName("Josso");
        owner2.getPets().add(aksPet);


        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Seee");
        vet1.setLastName("Heee");
        vet1.getSpecialitySet().add(savedDentistry);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Heey");
        vet2.setLastName("Oyoo");
        vet2.getSpecialitySet().add(savedRadiology);

        vetService.save(vet2);

        System.out.println("Load Vets");
    }
}
