package space.bum.jpa_hiber.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User3 {
  @Id
  @GeneratedValue
  private Long id;
  @Column(columnDefinition = "varchar(255) default '홍길동'")
  private String firstName;
  @Column(columnDefinition = "integer default 25")
  private Integer age;
  @Column(columnDefinition = "boolean default false")
  private Boolean locked;

}
