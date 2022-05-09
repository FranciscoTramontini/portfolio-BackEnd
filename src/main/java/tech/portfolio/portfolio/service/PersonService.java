package tech.portfolio.portfolio.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.portfolio.portfolio.exception.NotFoundException;
import tech.portfolio.portfolio.model.Person;
import tech.portfolio.portfolio.repo.PersonRepo;

@Transactional
@Service
public class PersonService {

    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> findAllPersons() {
        return personRepo.findAll();
    }

    public Person updatePerson(Person person) {
        return personRepo.save(person);
    }

    public Person findPersonById(Long id) {
        return personRepo.findPersonById(id).
                orElseThrow(() -> new NotFoundException("Person by id " + id + " was not found"));
    }

    public void deletePerson(Long id) {
        personRepo.deletePersonById(id);
    }
}
