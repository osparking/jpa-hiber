package space.bum.jpa_hiber.repository;

import org.springframework.data.repository.CrudRepository;

import space.bum.jpa_hiber.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
