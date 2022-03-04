package nl.hanze.services;

import nl.hanze.models.Course;
import nl.hanze.models.CourseRepository;
import nl.hanze.models.Student; //fully qualified name dmv reversed DNS
import nl.hanze.models.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataService {

    private final StudentRepository repository;
    private final CourseRepository courseRepository;

    @Autowired
    public DataService(
            StudentRepository repository,
            CourseRepository courseRepository
    ) {
        this.repository = repository;
        this.courseRepository = courseRepository;
    }

    // ===== COURSEDATA =====
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourse(Long id) {
        return this.courseRepository.findById(id);
    }

    public Course saveCourse(Course c) {
        return this.courseRepository.save(c);
    }


    // ===== STUDENTDATA =====
    public List<Student> getAllStudents() {
        return this.repository.findAll();
    }

    public Optional<Student> getStudent(Long id) {
        return this.repository.findById(id);
    }

    public Student saveStudent(Student st) {
        return this.repository.save(st);
    }

    public Student addCourseToStudent(Long st, Long c) throws Exception {
        Optional<Student> opt_student = this.repository.findById(st);
        Optional<Course> opt_course = this.courseRepository.findById(c);

        Student student = opt_student.orElseThrow( () -> new Exception() );
        Course course = opt_course.orElseThrow( () -> new Exception());

        student.addCourse(course);
        return this.repository.save(student);
    }
}
