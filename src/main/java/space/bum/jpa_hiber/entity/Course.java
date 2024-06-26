package space.bum.jpa_hiber.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

  @Basic
  @Id
  private int id;

  @Basic
  private String name;
}