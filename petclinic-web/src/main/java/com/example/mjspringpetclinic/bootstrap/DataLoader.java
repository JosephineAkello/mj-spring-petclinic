package com.example.mjspringpetclinic.bootstrap;

import com.example.mjspringpetclinic.model.Owner;
import com.example.mjspringpetclinic.model.Vet;
import com.example.mjspringpetclinic.service.OwnerService;
import com.example.mjspringpetclinic.service.VetService;
import com.example.mjspringpetclinic.service.map.OwnerServiceMap;
import com.example.mjspringpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {



    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setFirstName("Moo");
        owner1.setLastName("Jos");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2l);
        owner2.setFirstName("Maa");
        owner2.setLastName("Akello");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("Seee");
        vet1.setLastName("Heee");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Heey");
        vet2.setLastName("Oyoo");

        vetService.save(vet2);

        System.out.println("Load Vets");
    }
}
