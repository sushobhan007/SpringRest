package com.restspring.restspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;
    private String Name;
    private String description;

    public Course(long id, String name, String description) {
        this.id = id;
        Name = name;
        this.description = description;
    }

    public Course() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
