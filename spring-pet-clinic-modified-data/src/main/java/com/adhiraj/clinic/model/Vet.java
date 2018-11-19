package com.adhiraj.clinic.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vet")
public class Vet extends Person {

  private static final long serialVersionUID = -7765345505156613679L;

  @ManyToMany
  @JoinTable(name = "vet_x_speciality", joinColumns = @JoinColumn(name = "vet_id"),
      inverseJoinColumns = @JoinColumn(name = "speciality_id"))
  private Set<Speciality> specialities = new HashSet<>();

  public Set<Speciality> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(Set<Speciality> specialities) {
    this.specialities = specialities;
  }

}
