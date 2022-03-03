package nl.hanze.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String courseName;

    @ManyToMany
    List<Student> following;


    public Course(String courseName) {
        this.courseName = courseName;
    }
}
