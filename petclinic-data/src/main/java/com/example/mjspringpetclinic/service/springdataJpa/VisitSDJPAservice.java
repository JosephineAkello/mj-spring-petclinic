package com.example.mjspringpetclinic.service.springdataJpa;

import java.util.HashSet;
import java.util.Set;

import com.example.mjspringpetclinic.model.Visit;
import com.example.mjspringpetclinic.repositories.VisitRepository;
import com.example.mjspringpetclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitSDJPAservice implements VisitService {


    private final VisitRepository visitRepository;

    public VisitSDJPAservice(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
         visitRepository.findAll().forEach(visits::add);
    return  visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
     visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
   visitRepository.deleteById(aLong);
    }
}
