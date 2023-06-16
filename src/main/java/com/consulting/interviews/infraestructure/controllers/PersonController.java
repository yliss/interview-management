package com.consulting.interviews.infraestructure.controllers;

import com.consulting.interviews.business.PersonService;
import com.consulting.interviews.domain.persons.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/person")
public class PersonController {
    private PersonService personService;
    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @RequestMapping("/ping")
    public String healthCheck() {
        return "Pong!";
    }
    //CREATE
    @PostMapping
    public ResponseEntity<Person> createPerson(Person person) {
        personService.createPerson(person);
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


    public ResponseEntity<Message> deletePerson(Person person) {
        Message message = new Message("");

        return ResponseEntity.status(HttpStatus.OK).body(message);
    }
}
