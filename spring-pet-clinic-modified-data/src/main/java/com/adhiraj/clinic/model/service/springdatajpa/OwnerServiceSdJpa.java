package com.adhiraj.clinic.model.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Owner;
import com.adhiraj.clinic.model.repository.OwnerRepository;
import com.adhiraj.clinic.model.service.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerServiceSdJpa implements OwnerService {

  private final OwnerRepository ownerRepository;

  @Autowired
  public OwnerServiceSdJpa(OwnerRepository ownerRepository) {
    super();
    this.ownerRepository = ownerRepository;
  }

  @Override
  public Owner findById(Long id) {
    return ownerRepository.findById(id).orElse(null);
  }

  @Override
  public Set<Owner> findAll() {
    Set<Owner> owners = new HashSet<>();
    ownerRepository.findAll().forEach(owners::add);
    return owners;
  }

  @Override
  public Owner save(Owner object) {
    return ownerRepository.save(object);
  }

  @Override
  public void delete(Owner object) {
    ownerRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    ownerRepository.deleteById(id);
  }

  @Override
  public Owner findByLastName(String lastName) {
    return ownerRepository.findByLastName(lastName).orElse(null);
  }

}
