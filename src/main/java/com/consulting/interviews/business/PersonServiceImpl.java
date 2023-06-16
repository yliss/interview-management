package com.consulting.interviews.business;

import com.consulting.interviews.infraestructure.persistence.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personData;

    @Autowired
    public PersonServiceImpl(PersonRepository personData) {
        this.personData = personData;
    }
}
