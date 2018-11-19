package com.adhiraj.clinic.model.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.adhiraj.clinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Optional<Owner> findByLastName(String lastName);

}
