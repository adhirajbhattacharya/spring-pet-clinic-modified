package com.adhiraj.clinic.model.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import com.adhiraj.clinic.model.Visit;
import com.adhiraj.clinic.model.repository.VisitRepository;
import com.adhiraj.clinic.model.service.VisitService;

@Service
@Profile("springdatajpa")
public class VisitServiceSdJpa implements VisitService {

  private final VisitRepository visitRepository;

  @Autowired
  public VisitServiceSdJpa(VisitRepository visitRepository) {
    super();
    this.visitRepository = visitRepository;
  }

  @Override
  public Visit findById(Long id) {
    return visitRepository.findById(id).orElse(null);
  }

  @Override
  public Set<Visit> findAll() {
    Set<Visit> visits = new HashSet<>();
    visitRepository.findAll().forEach(visits::add);
    return visits;
  }

  @Override
  public Visit save(Visit object) {
    return visitRepository.save(object);
  }

  @Override
  public void delete(Visit object) {
    visitRepository.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    visitRepository.deleteById(id);
  }

}
