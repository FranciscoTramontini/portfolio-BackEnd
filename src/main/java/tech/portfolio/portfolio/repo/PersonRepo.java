package tech.portfolio.portfolio.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.portfolio.portfolio.model.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

    void deleteUserById(Long id);

    Optional<Person> findUserById(Long id);
}
