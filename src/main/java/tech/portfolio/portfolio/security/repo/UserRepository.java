package tech.portfolio.portfolio.security.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.portfolio.portfolio.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByNameUser(String nameUser);

    boolean existsByNameUser(String NameUser);
}
