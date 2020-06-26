package com.example.mjspringpetclinic.service.springdataJpa;

import java.util.HashSet;
import java.util.Set;

import com.example.mjspringpetclinic.model.Speciality;
import com.example.mjspringpetclinic.repositories.SpecialityRepository;
import com.example.mjspringpetclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class SpecialitySDJPAservice implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDJPAservice(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();

        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
     specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
    specialityRepository.deleteById(aLong);
    }
}
