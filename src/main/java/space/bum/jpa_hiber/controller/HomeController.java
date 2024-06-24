package space.bum.jpa_hiber.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import space.bum.jpa_hiber.entity.Gender;
import space.bum.jpa_hiber.entity.Student;
import space.bum.jpa_hiber.repository.StudentRepository;

@Controller
@RequestMapping
@Slf4j
public class HomeController {

  @Autowired
  private StudentRepository studentRepository;

  private Date convert(LocalDate localDate) {
    ZoneId defaultZoneId = ZoneId.systemDefault();
    return Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
  }

  @GetMapping("/")
  public String homepage() {
    var student = new Student();
    student.setBirthDate(convert(LocalDate.of(1999, 1, 1)));
    student.setName("홍길동");
    student.setGender(Gender.FEMALE);
    studentRepository.save(student);
    log.info("학생 생성됨");
    return "home";
  }

}
