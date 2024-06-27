package space.bum.jpa_hiber.entity;

import lombok.Data;

@Data
public class EqualByBusinessKey {

  private String email;

  @Override
  public int hashCode() {
    return java.util.Objects.hashCode(email);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (obj instanceof EqualByBusinessKey) {
      if (((EqualByBusinessKey) obj).getEmail().equals(getEmail())) {
        return true;
      }
    }

    return false;
  }
}