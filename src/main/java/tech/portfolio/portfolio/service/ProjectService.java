package tech.portfolio.portfolio.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.portfolio.portfolio.exception.NotFoundException;
import tech.portfolio.portfolio.model.Project;
import tech.portfolio.portfolio.repo.ProjectRepo;

@Transactional
@Service
public class ProjectService {

    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> findAllProjects() {
        return projectRepo.findAll();
    }

    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

    public Project findProjectById(Long id) {
        return projectRepo.findProjectById(id).
                orElseThrow(() -> new NotFoundException("Project by id " + id + " was not found"));
    }

    public void deleteProject(Long id) {
        projectRepo.deleteProjectById(id);
    }
}
