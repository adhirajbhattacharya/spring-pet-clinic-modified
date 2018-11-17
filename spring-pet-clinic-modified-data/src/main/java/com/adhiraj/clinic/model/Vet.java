package com.adhiraj.clinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

  private static final long serialVersionUID = -7765345505156613679L;

  private Set<Speciality> specialities = new HashSet<>();

  public Set<Speciality> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(Set<Speciality> specialities) {
    this.specialities = specialities;
  }

}
