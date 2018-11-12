package com.adhiraj.clinic.model.service.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Owner;
import com.adhiraj.clinic.model.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService {

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public Owner save(Owner object) {
    return super.save(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public Owner findByLastName(String lastName) {
    // TODO Auto-generated method stub
    return null;
  }

}
