package tech.portfolio.portfolio.security.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.portfolio.portfolio.security.enums.RoleName;
import tech.portfolio.portfolio.security.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByRoleName(RoleName roleName);
}
