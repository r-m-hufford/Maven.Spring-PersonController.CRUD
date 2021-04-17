package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository){
        this.repository = repository;
    }


    public Person createPerson(Person p) {
        return repository.save(p);
    }


    public Person getPerson(long id) {
        return repository.findOne(id);
    }

    public List<Person> getPersonList() {
        List<Person> people = new ArrayList<>();
        repository.findAll().forEach(people::add);
        return people;
    }

    public Person updatePerson(Person p, long id) {
        //find a person in the repo by id
        //update parameters using setters
        //save to repo
        //return
        Person person = getPerson(id);
        person.setFirstName(p.getFirstName());
        person.setLastName(p.getLastName());
        return repository.save(person);

    }

    public void deletePerson(long id) {
        repository.delete(repository.findOne(id));
    }
}
