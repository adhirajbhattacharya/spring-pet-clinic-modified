package com.adhiraj.clinic.model.service.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Speciality;
import com.adhiraj.clinic.model.service.SpecialityService;

@Service
public class SpecialityServiceMap extends AbstractServiceMap<Speciality, Long>
    implements SpecialityService {

  @Override
  public Speciality findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Set<Speciality> findAll() {
    return super.findAll();
  }

  @Override
  public Speciality save(Speciality object) {
    return super.save(object);
  }

  @Override
  public void delete(Speciality object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

}
