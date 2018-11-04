package com.adhiraj.clinic.model.service;

import java.util.Set;

public interface CrudService<T, S> {

  T findById(S id);

  Set<T> findAll();

  T save(T object);

  void delete(T object);

  void deleteById(S id);

}
