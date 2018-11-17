package com.adhiraj.clinic.model.service.map;

import java.util.Objects;
import java.util.Set;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Owner;
import com.adhiraj.clinic.model.service.OwnerService;
import com.adhiraj.clinic.model.service.PetService;
import com.adhiraj.clinic.model.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService {

  private final PetService petService;
  private final PetTypeService petTypeService;

  public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
    super();
    this.petService = petService;
    this.petTypeService = petTypeService;
  }

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
    if (Objects.nonNull(object)) {
      if (Objects.nonNull(object.getPets())) {
        object.getPets().forEach(pet -> {
          if (Objects.nonNull(pet.getPetType())) {
            if (Objects.isNull(pet.getPetType().getId())) {
              pet.setPetType(petTypeService.save(pet.getPetType()));
            }
          } else {
            throw new RuntimeException("Pet Type is mandatory.");
          }
          if (Objects.isNull(pet.getId())) {
            pet = petService.save(pet);
            // pet.setId(petService.save(pet).getId());
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
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public Owner findByLastName(String lastName) {
    // TODO Auto-generated method stub
    return null;
  }

}
