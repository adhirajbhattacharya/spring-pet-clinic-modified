package com.adhiraj.clinic.model.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractServiceMap<T, S> {

  protected Map<S, T> map = new HashMap<>();

  T findById(S id) {
    return map.get(id);
  }

  Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  T save(S id, T object) {
    map.put(id, object);
    return object;
  }

  void deleteById(S id) {
    map.remove(id);
  }

  void delete(T object) {
    map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

}
