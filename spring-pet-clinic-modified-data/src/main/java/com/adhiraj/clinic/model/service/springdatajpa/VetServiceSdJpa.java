package com.adhiraj.clinic.model.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Vet;
import com.adhiraj.clinic.model.repository.VetRepository;
import com.adhiraj.clinic.model.service.VetService;

@Service
@Profile("springdatajpa")
public class VetServiceSdJpa implements VetService {

  private final VetRepository vetRepository;

  @Autowired
  public VetServiceSdJpa(VetRepository vetRepository) {
    super();
    this.vetRepository = vetRepository;
  }

  @Override
  public Vet findById(Long id) {
    return vetRepository.findById(id).orElse(null);
  }

  @Override
  public Set<Vet> findAll() {
    Set<Vet> vets = new HashSet<>();
    vetRepository.findAll().forEach(vets::add);
    return vets;
  }

  @Override
  public Vet save(Vet object) {
    return vetRepository.save(object);
  }

  @Override
  public void delete(Vet object) {
    vetRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    vetRepository.deleteById(id);
  }

  @Override
  public Vet findByLastName(String lastName) {
    return vetRepository.findByLastName(lastName).orElse(null);
  }

}
