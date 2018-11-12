package com.adhiraj.clinic.model.service.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Pet;
import com.adhiraj.clinic.model.service.PetService;

@Service
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
    return super.save(object);
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
