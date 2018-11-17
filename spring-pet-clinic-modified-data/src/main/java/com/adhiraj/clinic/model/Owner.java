package com.adhiraj.clinic.model;

import java.util.Set;

public class Owner extends Person {

  private static final long serialVersionUID = -5083845544369473271L;
  
  private Set<Pet> pets;

  public Set<Pet> getPets() {
    return pets;
  }

  public void setPets(Set<Pet> pets) {
    this.pets = pets;
  }
  
}
