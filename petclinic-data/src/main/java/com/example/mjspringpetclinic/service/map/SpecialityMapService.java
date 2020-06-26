package com.example.mjspringpetclinic.service.map;

import java.util.Set;

import com.example.mjspringpetclinic.model.Speciality;
import com.example.mjspringpetclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
      super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
      super.deleteById(id);
    }
}
