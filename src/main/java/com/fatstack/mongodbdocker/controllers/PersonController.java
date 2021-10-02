package com.fatstack.mongodbdocker.controllers;

import com.fatstack.mongodbdocker.models.Person;
import com.fatstack.mongodbdocker.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/add")
    public ResponseEntity<Person> createNewPerson(@RequestBody Person person){
        var newPerson = personService.addPerson(person);
        return new ResponseEntity<>(newPerson, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<Map<String, Person>> getAllPerson(){
        var allPersons = personService.getAllPerson();
        return new ResponseEntity<>(allPersons, HttpStatus.OK);
    }
}
