package com.consulting.interviews.business;

import com.consulting.interviews.domain.persons.Person;
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

    public void createPerson(Person person) {
        personData.save(person);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Person getPerson(Long id) {
        return null;
    }

    /**
     * @param person
     */
    @Override
    public void updatePerson(Person person) {

    }

    /**
     * @param id
     */
    @Override
    public void deletePerson(Long id) {

    }

}
