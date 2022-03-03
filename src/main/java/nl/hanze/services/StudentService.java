package nl.hanze.services;

import nl.hanze.models.Student; //fully qualified name dmv reversed DNS
import nl.hanze.models.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Optional<Student> getStudent(Long id) {
        return repository.findById(id);
    }

    public Student saveStudent(Student st) {
        return repository.save(st);
    }
}
