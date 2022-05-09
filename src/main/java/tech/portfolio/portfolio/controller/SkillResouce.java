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
import tech.portfolio.portfolio.model.Skill;
import tech.portfolio.portfolio.service.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillResouce {

    private final SkillService skillService;

    public SkillResouce(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> getAllSkills() {
        List<Skill> skills = (List<Skill>) skillService.findAllSkills();

        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable("id") Long id) {
        Skill skill = skillService.findSkillById(id);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill) {
        Skill newSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill) {
        Skill updateSkill = skillService.updateSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id) {
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
