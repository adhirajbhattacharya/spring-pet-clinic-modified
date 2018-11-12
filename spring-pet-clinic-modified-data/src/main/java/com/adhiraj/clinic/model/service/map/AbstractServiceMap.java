package com.adhiraj.clinic.model.service.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.adhiraj.clinic.model.BaseEntity;

public abstract class AbstractServiceMap<T extends BaseEntity, S extends Long> {

  protected Map<Long, T> map = new HashMap<>();

  T findById(S id) {
    return map.get(id);
  }

  Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  T save(T object) {
    if (Objects.nonNull(object)) {
      if (Objects.isNull(object.getId())) {
        object.setId(getNextId());
      }
    } else {
      throw new NullPointerException("Object cannot be null");
    }
    map.put(object.getId(), object);

    return object;
  }

  void deleteById(S id) {
    map.remove(id);
  }

  void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  Long getNextId() {
    try {
      return Collections.max(map.keySet()) + 1L;
    } catch (NoSuchElementException e) {
      return 1L;
    }
  }

}
