package nl.hanze.api;

import nl.hanze.models.Course;
import nl.hanze.models.Student;
import nl.hanze.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping(path="api/v1/student")
public class StudentController {
    private DataService dataService;

    @Autowired
    public StudentController(DataService dataService) {
        this.dataService = dataService;
    }
    


    @GetMapping("enroll/{student}/{course}")
    public Student addCourseToStudent(
            @PathVariable("student") Long student_id,
            @PathVariable("course") Long course_id
    ) {
        try {
            return this.dataService.addCourseToStudent(student_id, course_id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }



    @GetMapping
    public List<Student> getAllStudents() {
        return this.dataService.getAllStudents();
    }

    @GetMapping("{id}")
    public Student getStudentByID(@PathVariable("id") Long id) throws ResponseStatusException {
        System.out.println(id);
        Optional<Student> rv = this.dataService.getStudent(id);
        return rv.orElseThrow ( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping(consumes="application/json")
    public ResponseEntity<Student> addStudent(@RequestBody Student data) {
        Student tmp = this.dataService.saveStudent(data);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Location", String.format("/api/v1/student/%s", tmp.getId()));
        return new ResponseEntity(tmp, headers, HttpStatus.CREATED);
    }


}
