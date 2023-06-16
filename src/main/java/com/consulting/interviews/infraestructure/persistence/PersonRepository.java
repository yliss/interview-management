package com.consulting.interviews.infraestructure.persistence;

import com.consulting.interviews.business.PersonData;
import com.consulting.interviews.domain.persons.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


}
