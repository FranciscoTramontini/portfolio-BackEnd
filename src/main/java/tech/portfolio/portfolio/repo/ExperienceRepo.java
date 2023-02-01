package tech.portfolio.portfolio.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.portfolio.portfolio.model.Experience;

public interface ExperienceRepo extends JpaRepository<Experience, Long> {

    void deleteExperienceById(Long id);

    Optional<Experience> findExperienceById(Long id);
}
