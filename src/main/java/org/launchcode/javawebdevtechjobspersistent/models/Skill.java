package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @Size(min=50, max = 200, message = "Description must be longer than 50 characters.")
    private String description;

    private String employer;

    private String skill;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill() {
    }

    public Skill(@NotBlank(message = "Name is required.") @Size(min = 3, message = "Name must be at least 3 characters long.") String name, @Size(min = 50, max = 200, message = "Description must be longer than 50 characters.") String description, String employer, String skill) {
        setName(name);
        this.description = description;
        this.employer = employer;
        this.skill = skill;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkill() {
        return skill;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}