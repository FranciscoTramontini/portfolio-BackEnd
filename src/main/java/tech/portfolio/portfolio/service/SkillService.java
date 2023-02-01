package tech.portfolio.portfolio.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.portfolio.portfolio.exception.NotFoundException;
import tech.portfolio.portfolio.model.Skill;
import tech.portfolio.portfolio.repo.SkillRepo;

@Transactional
@Service
public class SkillService {

    private final SkillRepo skillRepo;

    @Autowired
    public SkillService(SkillRepo skillRepo) {
        this.skillRepo = skillRepo;
    }

    public Skill addSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public List<Skill> findAllSkills() {
        return skillRepo.findAll();
    }

    public Skill updateSkill(Skill skill) {
        return skillRepo.save(skill);
    }

    public Skill findSkillById(Long id) {
        return skillRepo.findSkillById(id).
                orElseThrow(() -> new NotFoundException("Skill by id " + id + " was not found"));
    }

    public void deleteSkill(Long id) {
        skillRepo.deleteSkillById(id);
    }
}
