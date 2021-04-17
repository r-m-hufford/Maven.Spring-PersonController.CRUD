package io.zipcoder.crudapp;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/API")
@RestController
public class PersonController {

    private final PersonService service;

    @Autowired
    PersonController(PersonService service) {
        this.service=service;
    }

    @PostMapping("/people")
    ResponseEntity<Person> createPerson(@RequestBody io.zipcoder.crudapp.Person p) {
        Person person = service.createPerson(p);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/people/{id}")
    ResponseEntity<Person> getPerson(@PathVariable long id) {
        Person person = service.getPerson(id);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/people")
    ResponseEntity<List<Person>> getPersonList() {
        List<Person> people = service.getPersonList();
        return ResponseEntity.ok(people);
    }

    //////////
    @PutMapping("/people/{id}")
    ResponseEntity<Person> updatePerson(@RequestBody io.zipcoder.crudapp.Person p, @PathVariable long id){
        Person person = service.updatePerson(p, id);
        return ResponseEntity.ok(person);
    }


    /////////////
    @DeleteMapping("/people/{id}")
    ResponseEntity<String> deletePerson(@PathVariable long id){
        service.deletePerson(id);
        return ResponseEntity.ok("Person "+ id + " deleted");

    }





}
