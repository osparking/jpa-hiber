package space.bum.jpa_hiber.repository;

import org.springframework.data.repository.CrudRepository;

import space.bum.jpa_hiber.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
