package com.consulting.interviews.infraestructure.controllers;

import com.consulting.interviews.domain.persons.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/person")
public class PersonController {
    @RequestMapping("/ping")
    public String healthCheck() {
        return "Pong!";
    }
    //CREATE
    @PostMapping
    public ResponseEntity<Person> createPerson(Person person) {

        return ResponseEntity.status(HttpStatus.OK).body(person);
    }
    //READ
    @GetMapping(path = "/{id}")
    public Person getPerson() {
        Person person = new Person();
        person.setId(0L);
        person.setName("Sami");
        return person;
    }

    //UPDATE
    @PutMapping (path = "/{id}")
    public ResponseEntity<Person> updatePerson(Person person) {

        return ResponseEntity.status(HttpStatus.OK).body(person);
    }
    //DELETE


}
