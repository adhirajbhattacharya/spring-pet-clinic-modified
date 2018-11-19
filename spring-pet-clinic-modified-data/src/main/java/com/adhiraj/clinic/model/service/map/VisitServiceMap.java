package com.adhiraj.clinic.model.service.map;

import java.util.Objects;
import java.util.Set;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Visit;
import com.adhiraj.clinic.model.service.VisitService;

@Service
@Profile({"default", "map"})
public class VisitServiceMap extends AbstractServiceMap<Visit, Long> implements VisitService {

  @Override
  public Visit findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Set<Visit> findAll() {
    return super.findAll();
  }

  @Override
  public Visit save(Visit object) {
    if (Objects.nonNull(object.getPet()) || Objects.nonNull(object.getPet().getOwner())
        || Objects.nonNull(object.getPet().getId())
        || Objects.nonNull(object.getPet().getOwner().getId())) {
      throw new RuntimeException("Invalid Visit");
    }

    return super.save(object);
  }

  @Override
  public void delete(Visit object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

}
