package space.bum.jpa_hiber.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User2 {
  private static Log log = LogFactory.getLog(User2.class);

  @Id
  @GeneratedValue
  private int id;

  private String userName;
  private String firstName;
  private String lastName;
  @Transient
  private String fullName;
}
