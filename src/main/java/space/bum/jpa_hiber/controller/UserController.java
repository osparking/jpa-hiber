package space.bum.jpa_hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import space.bum.jpa_hiber.entity.User;
import space.bum.jpa_hiber.repository.UserRepository;

@RestController
@RequestMapping
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/user")
  public String saveUser() {
    var user = new User();
    user.setId(100);
    user.setEmail("guest@gmail.com");
    userRepository.save(user);
    return "user saved";
  }

}
