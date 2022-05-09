package tech.portfolio.portfolio.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.portfolio.portfolio.exception.NotFoundException;
import tech.portfolio.portfolio.model.Education;
import tech.portfolio.portfolio.repo.EducationRepo;

@Transactional
@Service
public class EducationService {

    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }

    public Education addEducation(Education education) {
        return educationRepo.save(education);
    }

    public List<Education> findAllEducations() {
        return educationRepo.findAll();
    }

    public Education updateEducation(Education education) {
        return educationRepo.save(education);
    }

    public Education findEducationById(Long id) {
        return educationRepo.findEducationById(id).
                orElseThrow(() -> new NotFoundException("Education by id " + id + " was not found"));
    }

    public void deleteEducation(Long id) {
        educationRepo.deleteEducationById(id);
    }
}
