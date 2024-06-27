package space.bum.jpa_hiber.entity;

import lombok.Data;

@Data
@Entity
public class Company {
  private Integer id;

  private String name;

  private String address;

  private String phone;

  private String contactFirstName;

  private String contactLastName;

  private String contactPhone;
}
