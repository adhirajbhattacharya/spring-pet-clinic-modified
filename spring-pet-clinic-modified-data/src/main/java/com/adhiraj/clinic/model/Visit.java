package com.adhiraj.clinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {

  private static final long serialVersionUID = 5483242588757458543L;

  private LocalDate date;
  private String desc;
  private Pet pet;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }

}
