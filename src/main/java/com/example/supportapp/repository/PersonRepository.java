package com.example.supportapp.repository;

import com.example.supportapp.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {
    // Additional custom queries (if needed) can be defined here
}