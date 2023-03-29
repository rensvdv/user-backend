package com.forum.userbackend.repositories;

import com.forum.userbackend.logic.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}

