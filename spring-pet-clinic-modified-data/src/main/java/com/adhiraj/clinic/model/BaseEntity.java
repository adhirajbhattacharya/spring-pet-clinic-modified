package com.adhiraj.clinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

  private static final long serialVersionUID = 4425726889406247914L;

  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

}
