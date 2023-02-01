package tech.portfolio.portfolio.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.portfolio.portfolio.model.Education;

public interface EducationRepo extends JpaRepository<Education, Long> {

    void deleteEducationById(Long id);

    Optional<Education> findEducationById(Long id);
}
