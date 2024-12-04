package com.example.supportapp.controller;

import com.example.supportapp.model.Donation;
import com.example.supportapp.model.Person;
import com.example.supportapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @GetMapping
    public Iterable<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }

    @PostMapping("/{id}/donation")
    public Person addDonation(@PathVariable String id, @RequestBody Donation donation) {
        return personService.addDonation(id, donation);
    }
}
