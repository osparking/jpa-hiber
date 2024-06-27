package space.bum.jpa_hiber.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ContactPerson {
  private String firstName;

  private String lastName;

  private String phone;
}
