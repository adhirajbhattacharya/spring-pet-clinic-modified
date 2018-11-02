package com.adhiraj.clinic.model.service;

import java.util.Set;
import com.adhiraj.clinic.model.Vet;

public interface VetService {

  Vet findById(Long id);

  Vet findByLastName(String lastName);

  void save(Vet owner);

  Set<Vet> findAll();

}
