package nl.hanze.api;

import nl.hanze.models.Course;
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
@RequestMapping(path="api/v1/course")
public class CourseController {
    private DataService dataService;

    @Autowired
    public CourseController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return this.dataService.getAllCourses();
    }

    @GetMapping("{id}")
    public Course getCourseByID(@PathVariable("id") Long id) throws ResponseStatusException {
        Optional<Course> rv = this.dataService.getCourse(id);
        return rv.orElseThrow ( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping(consumes="application/json")
    public ResponseEntity<Course> addCourse(@RequestBody Course data) {
        Course tmp = this.dataService.saveCourse(data);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Location", String.format("/api/v1/course/%s", tmp.getId()));
        return new ResponseEntity(tmp, headers, HttpStatus.CREATED);
    }
}
