package space.bum.jpa_hiber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

  @Id
  private int id;

  private String name;
}