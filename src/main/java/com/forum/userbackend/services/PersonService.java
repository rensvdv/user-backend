package com.forum.userbackend.services;


import com.forum.userbackend.logic.Person;
import com.forum.userbackend.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    public List<Person> GetAll() {
        return personRepository.findAll();
    }

    public Person CreatePerson(Person person) {
        return personRepository.save(person);
    }
}
