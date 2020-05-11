package com.example.mjspringpetclinic.bootstrap;

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

    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService  = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
