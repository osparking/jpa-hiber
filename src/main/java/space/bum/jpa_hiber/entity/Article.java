package space.bum.jpa_hiber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = Article.TABLE_NAME)
public class Article {
  @Id
  private Integer id;
  public static final String TABLE_NAME = "ARTICLES";
  private String author;
  private String periodicalTitle;

}
