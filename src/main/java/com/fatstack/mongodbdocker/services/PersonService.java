package com.fatstack.mongodbdocker.services;

import com.fatstack.mongodbdocker.models.Person;
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

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person addPerson(Person newPersonFromRequest) {
        newPersonFromRequest.setCreatedAt(new Date().getTime());
        return personRepo.save(newPersonFromRequest);
    }

    public Map<String, Person> getAllPerson(){
        return personRepo.findAll().stream().collect(Collectors.toMap(Person::getId, Function.identity()));
    }
}
