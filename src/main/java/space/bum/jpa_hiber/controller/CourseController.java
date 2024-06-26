package space.bum.jpa_hiber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import space.bum.jpa_hiber.entity.Course;
import space.bum.jpa_hiber.repository.CourseRepository;

@Controller
@RequestMapping("/course")
public class CourseController {

  @Autowired
  CourseRepository courseRepository;

  @GetMapping
  public String showHome() {
    return "course";
  }

  @PostMapping("/make")
  public String createCourse() {
    var course = new Course();
    courseRepository.save(course);
    return "redirect:/course";
  }
}
