package com.consulting.hr.domain.recruitment;

import com.consulting.hr.domain.persons.Person;

import java.util.Date;

public class Interview {

    private Date date;
    private Person recruiter;
    private JobPosition jobPosition;
    private Person technicalAdvisor;
    private String notes;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Person recruiter) {
        this.recruiter = recruiter;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public Person getTechnicalAdvisor() {
        return technicalAdvisor;
    }

    public void setTechnicalAdvisor(Person technicalAdvisor) {
        this.technicalAdvisor = technicalAdvisor;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


}
