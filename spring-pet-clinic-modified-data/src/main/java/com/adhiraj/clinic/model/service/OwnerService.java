package com.adhiraj.clinic.model.service;

import java.util.Set;
import com.adhiraj.clinic.model.Owner;

public interface OwnerService {

  Owner findById(Long id);

  Owner findByLastName(String lastName);

  void save(Owner owner);

  Set<Owner> findAll();

}
