package ScrapWala.ScrapWala.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ScrapWala.ScrapWala.entities.User;

public interface UserDao extends JpaRepository<User, Long> {

}
