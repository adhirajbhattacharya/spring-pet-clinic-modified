package com.adhiraj.clinic.model.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Speciality;
import com.adhiraj.clinic.model.repository.SpecialityRepository;
import com.adhiraj.clinic.model.service.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialityServiceSdJpa implements SpecialityService {

  private final SpecialityRepository specialityRepository;

  @Autowired
  public SpecialityServiceSdJpa(SpecialityRepository specialityRepository) {
    super();
    this.specialityRepository = specialityRepository;
  }

  @Override
  public Speciality findById(Long id) {
    return specialityRepository.findById(id).orElse(null);
  }

  @Override
  public Set<Speciality> findAll() {
    Set<Speciality> specialities = new HashSet<>();
    specialityRepository.findAll().forEach(specialities::add);
    return specialities;
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
  public void deleteById(Long id) {
    specialityRepository.deleteById(id);
  }

}
