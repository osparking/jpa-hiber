package space.bum.jpa_hiber.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@EntityListeners(AuditTrailListener.class)
@Entity
@Data
@Table
public class User2 {
  private static Log log = LogFactory.getLog(User2.class);

  @Id
  @GeneratedValue
  private int id;

  private String userName;
  private String firstName;

  @Length(min = 1, max = 2)
  private String lastName;
  @Transient
  private String fullName;

  @PrePersist
  public void logNewUserAttempt() {
    log.info("추가되는 사용자의 유저명: " + userName);
  }

  @PostPersist
  public void logNewUserAdded() {
    log.info("유저명 '" + userName + "'의 아이디: " + id);
  }

  @PreRemove
  public void logUserRemovalAttempt() {
    log.info("삭제될 유저의 유저명: " + userName);
  }

  @PostRemove
  public void logUserRemoval() {
    log.info("삭제된 유저의 이름: " + userName);
  }

  @PreUpdate
  public void logUserUpdateAttempt() {
    log.info("내용이 바뀌는 유저의 이름: " + userName);
  }

  @PostUpdate
  public void logUserUpdate() {
    log.info("내용이 바뀐 유저의 이름: " + userName);
  }

  @PostLoad
  public void logUserLoad() {
    fullName = firstName + " " + lastName;
  }
}
