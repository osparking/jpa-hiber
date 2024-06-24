package space.bum.jpa_hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import space.bum.jpa_hiber.entity.User;
import space.bum.jpa_hiber.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
  private static int currentId = 1;

  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public String saveUser() {
    return "home";
  }

  @PostMapping
  public String createUser() {
    var user = new User();
    user.setId(currentId++);
    user.setEmail("guest@gmail.com");
    userRepository.save(user);
    return "home";
  }

}
