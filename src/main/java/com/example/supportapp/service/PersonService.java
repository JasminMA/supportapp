package com.example.supportapp.service;

import com.example.supportapp.model.Donation;
import com.example.supportapp.model.Person;
import com.example.supportapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }

    public Person addDonation(String personId, Donation donation) {
        Optional<Person> personOptional = personRepository.findById(personId);
        if (personOptional.isPresent()) {
            Person person = personOptional.get();
            List<Donation> donations = person.getDonations();
            donations.add(donation);
            person.setDonations(donations);
            return personRepository.save(person);
        }
        throw new RuntimeException("Person not found with id: " + personId);
    }
}
