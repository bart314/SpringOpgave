//package nl.hanze.models;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student bart = new Student("Bart", LocalDate.of(1970, 11, 27), "bart@host.com");
//            Student fenna = new Student("Fenna", LocalDate.of(1970, 11, 19), "fenna@host.com");
//            Student henk = new Student("Henk", LocalDate.of(2000, 10, 01), "henk@host.com");
//            Student anna = new Student("Anna", LocalDate.of(1931, 10, 11), "anna@host.com");
//
//            repository.saveAll(List.of(bart, fenna, henk, anna));
//        };
//    }
//}
