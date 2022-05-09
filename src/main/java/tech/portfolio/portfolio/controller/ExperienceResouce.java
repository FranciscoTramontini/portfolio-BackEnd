package tech.portfolio.portfolio.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.portfolio.portfolio.model.Experience;
import tech.portfolio.portfolio.service.ExperienceService;

@RestController
@RequestMapping("/experience")
public class ExperienceResouce {

    private final ExperienceService experienceService;

    public ExperienceResouce(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getAllExperiences() {
        List<Experience> experiences = (List<Experience>) experienceService.findAllExperiences();

        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable("id") Long id) {
        Experience experience = experienceService.findExperienceById(id);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience experience) {
        Experience newExperience = experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience) {
        Experience updateExperience = experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id) {
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
