package tech.portfolio.portfolio.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.portfolio.portfolio.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Long> {

    void deleteProjectById(Long id);

    Optional<Project> findProjectById(Long id);
}
