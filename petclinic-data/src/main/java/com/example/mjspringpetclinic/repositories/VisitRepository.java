package com.example.mjspringpetclinic.repositories;

import com.example.mjspringpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
