package com.example.supportapp.repository;

import com.example.supportapp.model.Person;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface PersonRepository extends CrudRepository<Person, String> {
    // Additional custom queries (if needed) can be defined here
}