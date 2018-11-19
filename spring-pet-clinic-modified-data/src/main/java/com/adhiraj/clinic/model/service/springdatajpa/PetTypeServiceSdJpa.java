package com.adhiraj.clinic.model.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.PetType;
import com.adhiraj.clinic.model.repository.PetTypeRepository;
import com.adhiraj.clinic.model.service.PetTypeService;

@Service
@Profile("springdatajpa")
public class PetTypeServiceSdJpa implements PetTypeService {

  private final PetTypeRepository petTypeRepository;

  @Autowired
  public PetTypeServiceSdJpa(PetTypeRepository petTypeRepository) {
    super();
    this.petTypeRepository = petTypeRepository;
  }

  @Override
  public PetType findById(Long id) {
    return petTypeRepository.findById(id).orElse(null);
  }

  @Override
  public Set<PetType> findAll() {
    Set<PetType> petTypes = new HashSet<>();
    petTypeRepository.findAll().forEach(petTypes::add);
    return petTypes;
  }

  @Override
  public PetType save(PetType object) {
    return petTypeRepository.save(object);
  }

  @Override
  public void delete(PetType object) {
    petTypeRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    petTypeRepository.deleteById(id);
  }

}
