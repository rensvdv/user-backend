package com.forum.userbackend.controllers;

import com.forum.userbackend.services.PersonService;
import com.forum.userbackend.logic.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/User")
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping()
    public List<Person> GetAll() {
        return personService.GetAll();
    }

    @PostMapping("/Add")
    public Person AddPerson(@RequestBody Person person) {
        return personService.CreatePerson(person);
    }

}
