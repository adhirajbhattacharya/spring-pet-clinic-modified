package com.adhiraj.clinic.model.repository;

import org.springframework.data.repository.CrudRepository;
import com.adhiraj.clinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
