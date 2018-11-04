package com.adhiraj.clinic.model.service.map;

import java.util.Set;
import com.adhiraj.clinic.model.Vet;
import com.adhiraj.clinic.model.service.CrudService;

public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements CrudService<Vet, Long> {

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet save(Vet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

}
