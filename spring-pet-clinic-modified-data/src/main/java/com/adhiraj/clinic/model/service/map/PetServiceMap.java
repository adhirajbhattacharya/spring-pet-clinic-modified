package com.adhiraj.clinic.model.service.map;

import java.util.Set;
import com.adhiraj.clinic.model.Pet;
import com.adhiraj.clinic.model.service.PetService;

public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService {

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }
  
  @Override
  public Pet save(Pet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet object) {
    super.delete(object);
  }

}
