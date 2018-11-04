package com.adhiraj.clinic.model.service;

import com.adhiraj.clinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

  Vet findByLastName(String lastName);

}
