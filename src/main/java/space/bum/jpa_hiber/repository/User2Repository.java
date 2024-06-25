package space.bum.jpa_hiber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import space.bum.jpa_hiber.entity.User2;

public interface User2Repository extends JpaRepository<User2, Integer> {
  public User2 findByUserName(String userName);

}
