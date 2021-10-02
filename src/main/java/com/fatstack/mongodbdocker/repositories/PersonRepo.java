package com.fatstack.mongodbdocker.repositories;

import com.fatstack.mongodbdocker.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepo extends MongoRepository<Person, String> {
}
