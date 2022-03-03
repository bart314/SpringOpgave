package nl.hanze.api;

import nl.hanze.models.Student;
import nl.hanze.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping(path="api/v1/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }

    @GetMapping("{id}")
    @ResponseBody
    public Student getStudentByID(@PathVariable("id") Long id) throws ResponseStatusException {
        System.out.println(id);
        Optional<Student> rv = this.studentService.getStudent(id);
        return rv.orElseThrow ( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping(value="/", consumes="application/json")
    @ResponseStatus
    public Student addStudent(@RequestBody Student data) {
        System.out.println(data);
        System.out.println("Hier");
        return this.studentService.saveStudent(data);
    }
}
