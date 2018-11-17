package com.adhiraj.clinic.model.service.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.PetType;
import com.adhiraj.clinic.model.service.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractServiceMap<PetType, Long> implements PetTypeService {

  @Override
  public PetType findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Set<PetType> findAll() {
    return super.findAll();
  }

  @Override
  public PetType save(PetType object) {
    return super.save(object);
  }

  @Override
  public void delete(PetType object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }


}