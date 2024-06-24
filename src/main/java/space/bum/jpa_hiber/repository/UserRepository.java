package space.bum.jpa_hiber.repository;

import org.springframework.data.repository.CrudRepository;

import space.bum.jpa_hiber.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
