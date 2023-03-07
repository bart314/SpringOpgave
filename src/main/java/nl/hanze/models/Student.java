package nl.hanze.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private  String name;
    private  LocalDate dob;
    private  String email;

    @ManyToMany
    private Set<Course> follows;

    public Student(String name, LocalDate dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public void addCourse(Course c) {
        this.follows.add(c);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public Set<Course> getFollows() {
        return follows;
    }
}
