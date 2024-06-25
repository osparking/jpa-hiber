package space.bum.jpa_hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import space.bum.jpa_hiber.entity.User3;
import space.bum.jpa_hiber.repository.User3Repository;

@Controller
@RequestMapping("/home3")
public class User3Controller {

  @Autowired
  User3Repository user3Repository;

  @GetMapping
  public String showHome() {
    return "home3";
  }

  @PostMapping("/make")
  public String createUser2() {
    var user3 = new User3();
    user3Repository.save(user3);
    return "redirect:/home3";
  }
}
