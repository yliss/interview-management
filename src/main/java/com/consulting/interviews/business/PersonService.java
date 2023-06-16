package com.consulting.interviews.business;

import com.consulting.interviews.domain.persons.Person;

public interface PersonService {

    void createPerson(Person person);
    Person getPerson (Long id);
    void updatePerson (Person person);

}
