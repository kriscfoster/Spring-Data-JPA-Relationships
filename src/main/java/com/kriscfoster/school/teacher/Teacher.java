package com.kriscfoster.school.teacher;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kriscfoster.school.subject.Subject;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "teacher")
    private Set<Subject> subjects;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubjects() {
        return this.subjects;
    }

}
