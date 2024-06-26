package space.bum.jpa_hiber.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "student_table", schema = "college")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "student_name", length = 50, nullable = false, unique = false)
  private String name;

  private transient Integer age;

  @Temporal(TemporalType.DATE)
  private Date birthDate;

  @Enumerated(EnumType.STRING)
  private Gender gender;

}