package by.andreyko.projects.testwebapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Visit {

    @Id
    @GeneratedValue
    public Long id;

    public String description;
}