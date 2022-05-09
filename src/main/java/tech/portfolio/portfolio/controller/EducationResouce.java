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
import tech.portfolio.portfolio.model.Education;
import tech.portfolio.portfolio.service.EducationService;

@RestController
@RequestMapping("/education")
public class EducationResouce {

    private final EducationService educationService;

    public EducationResouce(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Education>> getAllEducations() {
        List<Education> educations = (List<Education>) educationService.findAllEducations();

        return new ResponseEntity<>(educations, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable("id") Long id) {
        Education education = educationService.findEducationById(id);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education education) {
        Education newEducation = educationService.addEducation(education);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education) {
        Education updateEducation = educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
