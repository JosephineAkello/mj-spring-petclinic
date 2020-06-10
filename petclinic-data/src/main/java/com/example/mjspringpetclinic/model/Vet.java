package com.example.mjspringpetclinic.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialitySet() {
        return specialities;
    }

    public void setSpecialitySet(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
