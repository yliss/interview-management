package com.consulting.interviews.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    private final SkillsData skillsData;

    @Autowired
    public PersonServiceImpl(SkillsData skillsData) {
        this.skillsData = skillsData;
    }
}
