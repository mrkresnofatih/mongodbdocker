package com.fatstack.mongodbdocker.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fatstack.mongodbdocker.models.Person;
import com.fatstack.mongodbdocker.models.PersonNewDto;
import com.fatstack.mongodbdocker.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private final PersonRepo personRepo;
    private final ObjectMapper objectMapper;

    @Autowired
    public PersonService(PersonRepo personRepo, ObjectMapper objectMapper) {
        this.personRepo = personRepo;
        this.objectMapper = objectMapper;
    }

    public Person addPerson(PersonNewDto newPersonFromRequest) {
        var newPerson = objectMapper.convertValue(newPersonFromRequest, Person.class);
        newPerson.setCreatedAt(new Date().getTime());
        return personRepo.save(newPerson);
    }

    public Map<String, Person> getAllPerson() {
        return personRepo.findAll().stream().collect(Collectors.toMap(Person::getId, Function.identity()));
    }
}
