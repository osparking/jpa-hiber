package space.bum.jpa_hiber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ARTICLES")
public class Article {
  @Id
  private Integer id;
  private String author;
  private String periodicalTitle;

}
