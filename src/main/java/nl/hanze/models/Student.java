package nl.hanze.models;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate dob;
    private String email;

    @ManyToMany
    Set<Course> follows;

    public Student(String name, LocalDate dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public void addCourse(Course c) {
        this.follows.add(c);
    }
}
