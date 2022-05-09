package tech.portfolio.portfolio.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.portfolio.portfolio.model.Skill;

public interface SkillRepo extends JpaRepository<Skill, Long> {

    void deleteSkillById(Long id);

    Optional<Skill> findSkillById(Long id);
}
