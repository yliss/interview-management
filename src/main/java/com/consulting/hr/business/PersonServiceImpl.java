package com.consulting.hr.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonsService {
    private final SkillsData skillsData;

    @Autowired
    public PersonServiceImpl(SkillsData skillsData) {
        this.skillsData = skillsData;
    }
}
