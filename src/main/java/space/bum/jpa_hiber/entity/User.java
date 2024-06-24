package space.bum.jpa_hiber.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Table(name = "Users")
@Data
public class User {

  @Id
  private Integer id;

  private String email;

  private String password;

  @Transient
  private Date loginTime;

  // getters and setters
}