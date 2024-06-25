package space.bum.jpa_hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import space.bum.jpa_hiber.entity.User2;
import space.bum.jpa_hiber.repository.User2Repository;

@Controller
@RequestMapping("/home2")
public class User2Controller {

  @Autowired
  User2Repository user2Repository;

  @GetMapping
  public String showHome() {
    return "home2";
  }

  @PostMapping("/make")
  public String createUser2() {
    var user2 = new User2();
    user2.setUserName("kim_ms");
    user2.setFirstName("명수");
    user2.setLastName("김");
    user2Repository.save(user2);
    return "redirect:/home2";
  }

  @PostMapping("/delete")
  public String deleteUser2(@RequestParam String userid) {
    user2Repository.deleteById(Integer.valueOf(userid));
    return "redirect:/home2";
  }

}
