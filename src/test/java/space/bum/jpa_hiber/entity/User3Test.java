package space.bum.jpa_hiber.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import space.bum.jpa_hiber.repository.User3Repository;

@SpringBootTest

class User3Test {

  @Autowired
  private User3Repository userRepository;

  @Test
  void saveUser_shouldSaveWithDefaultFieldValues() {
    var user = new User3();
    user = userRepository.save(user);

    assertEquals(user.getFirstName(), "길동");
    assertEquals(user.getAge(), 25);
    assertFalse(user.getLocked());
  }

}

