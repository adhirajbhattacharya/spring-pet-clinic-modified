package com.adhiraj.clinic.model.service;

import java.util.Set;
import com.adhiraj.clinic.model.Pet;

public interface PetService {

  Pet findById(Long id);

  void save(Pet owner);

  Set<Pet> findAll();

}
