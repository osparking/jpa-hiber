package space.bum.jpa_hiber.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Student {
  private Long id;
  private String name;

}
