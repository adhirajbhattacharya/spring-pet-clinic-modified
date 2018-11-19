package com.adhiraj.clinic.model.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.adhiraj.clinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

  Optional<Vet> findByLastName(String lastName);

}
