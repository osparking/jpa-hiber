package space.bum.jpa_hiber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User3 {
  @Id
  private Long id;
  private String firstName = "길동";
  private Integer age = 25;
  private Boolean locked = false;

}
