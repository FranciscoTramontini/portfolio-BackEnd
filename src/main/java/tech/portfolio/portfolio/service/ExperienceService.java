package tech.portfolio.portfolio.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.portfolio.portfolio.exception.NotFoundException;
import tech.portfolio.portfolio.model.Experience;
import tech.portfolio.portfolio.repo.ExperienceRepo;

@Transactional
@Service
public class ExperienceService {

    private final ExperienceRepo experienceRepo;

    @Autowired
    public ExperienceService(ExperienceRepo experienceRepo) {
        this.experienceRepo = experienceRepo;
    }

    public Experience addExperience(Experience experience) {
        return experienceRepo.save(experience);
    }

    public List<Experience> findAllExperiences() {
        return experienceRepo.findAll();
    }

    public Experience updateExperience(Experience experience) {
        return experienceRepo.save(experience);
    }

    public Experience findExperienceById(Long id) {
        return experienceRepo.findExperienceById(id).
                orElseThrow(() -> new NotFoundException("Experience by id " + id + " was not found"));
    }

    public void deleteExperience(Long id) {
        experienceRepo.deleteExperienceById(id);
    }
}
