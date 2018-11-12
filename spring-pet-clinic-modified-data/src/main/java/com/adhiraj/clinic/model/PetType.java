package com.adhiraj.clinic.model;

public class PetType extends BaseEntity {

  private static final long serialVersionUID = -5254437534562369982L;

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
   
}
