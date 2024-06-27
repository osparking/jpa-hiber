package space.bum.jpa_hiber.entity;

import jakarta.persistence.Embedded;
import lombok.Data;

@Data
@Entity
public class Company {
  private Integer id;

  private String name;

  private String address;

  private String phone;

  @Embedded
  private ContactPerson contactPerson;
}
