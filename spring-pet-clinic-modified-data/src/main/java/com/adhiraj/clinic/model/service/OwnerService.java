package com.adhiraj.clinic.model.service;

import com.adhiraj.clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

}
