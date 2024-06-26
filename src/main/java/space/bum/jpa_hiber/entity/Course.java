package space.bum.jpa_hiber.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;

@Entity
public class Course {

  @Id
  private int id;

  @Basic(optional = false, fetch = FetchType.LAZY)
  private String name;
}