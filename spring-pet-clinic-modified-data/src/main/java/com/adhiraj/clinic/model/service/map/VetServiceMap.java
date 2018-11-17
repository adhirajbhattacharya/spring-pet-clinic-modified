package com.adhiraj.clinic.model.service.map;

import java.util.Objects;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Vet;
import com.adhiraj.clinic.model.service.SpecialityService;
import com.adhiraj.clinic.model.service.VetService;

@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService {

  private final SpecialityService specialityService;

  @Autowired
  public VetServiceMap(SpecialityService specialityService) {
    super();
    this.specialityService = specialityService;
  }

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
    if (Objects.nonNull(object)) {
      if (Objects.nonNull(object.getSpecialities())) {
        object.getSpecialities().forEach(speciality -> {
          if (Objects.isNull(speciality.getId())) {
            speciality = specialityService.save(speciality);
          }
        });
      }
      return super.save(object);
    } else {
      return null;
    }
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public Vet findByLastName(String lastName) {
    // TODO Auto-generated method stub
    return null;
  }

}
