package com.kirillrublevsky.app.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "candidate")
public class Candidate implements Serializable {

    @Id
    @Column(name = "candidate_id")
    @GeneratedValue
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "addition_date")
    private String additionDate;

    @Column(name = "interview_date")
    private String interviewDate;

    @Column(name = "skills")
    private String skills;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, String additionDate, String interviewDate, String skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.additionDate = additionDate;
        this.interviewDate = interviewDate;
        this.skills = skills;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdditionDate() {
        return additionDate;
    }

    public void setAdditionDate(String additionDate) {
        this.additionDate = additionDate;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
