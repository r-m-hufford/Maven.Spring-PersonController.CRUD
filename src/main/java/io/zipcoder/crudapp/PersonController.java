package io.zipcoder.crudapp;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collector;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class PersonController {

    private final PersonRepository repository;

    PersonController(PersonRepository personRepository) {
        this.repository=personRepository;
    }
    //get - ALL
    //get - ONE
    //post - CREATE
    //put - UPDATE
    //delete - DELETE

    @PutMapping("/people")
    io.zipcoder.crudapp.Person createPerson(@RequestBody io.zipcoder.crudapp.Person p) {
        Person person =
    }

    @GetMapping("/people/{id}")
    io.zipcoder.crudapp.Person getPerson(@PathVariable int id) {}

    @GetMapping("/people")
    List<io.zipcoder.crudapp.Person> getPersonList() {}

    @PostMapping("/people/{id}")
    io.zipcoder.crudapp.Person updatePerson(@RequestBody io.zipcoder.crudapp.Person p){}

    @DeleteMapping("/people/{id}")
    void deletePerson(@PathVariable int id){}





}
