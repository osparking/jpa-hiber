package space.bum.jpa_hiber.entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

public class AuditTrailListener {
  private static Log log = LogFactory.getLog(AuditTrailListener.class);
  
  @PrePersist
  @PreUpdate
  @PreRemove
  private void beforeAnyUpdate(User2 user2) {
      if (user2.getId() == 0) {
        log.info("[USER2 AUDIT] 유저 추가 직전");
      } else {
        log.info("[USER2 AUDIT] 유저 갱신/삭제 직전: " + user2.getId());
      }
  }
  
  @PostPersist
  @PostUpdate
  @PostRemove
  private void afterAnyUpdate(User2 user2) {
    log.info(
        "[USER2 AUDIT] 추가/갱신/삭제된 유저 ID: " + user2.getId());
  }
  
  @PostLoad
  private void afterLoad(User2 user2) {
    log.info("[USER2 AUDIT] DB에서 적재된 유저 ID: " + user2.getId());
  }
}