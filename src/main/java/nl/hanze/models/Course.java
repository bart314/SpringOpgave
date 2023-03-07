package nl.hanze.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String courseName;

    @ManyToMany
    private List<Student> following;
    public Course() {}
    public Course(String courseName) {
        this.courseName = courseName;
    }




    public Long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getFollowing() {
        return following;
    }
}
