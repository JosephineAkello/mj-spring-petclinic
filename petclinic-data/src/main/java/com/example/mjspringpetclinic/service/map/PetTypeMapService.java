package com.example.mjspringpetclinic.service.map;

import java.util.Set;

import com.example.mjspringpetclinic.model.PetType;
import com.example.mjspringpetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
     super.deleteById(id);
    }
}