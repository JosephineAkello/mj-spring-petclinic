package com.example.mjspringpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialitySet() {
        return specialities;
    }

    public void setSpecialitySet(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
