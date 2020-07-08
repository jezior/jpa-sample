package pl.am.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.am.model.User;

import java.util.List;

//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
public interface UserRepository extends CrudRepository<User, Long> {
}
