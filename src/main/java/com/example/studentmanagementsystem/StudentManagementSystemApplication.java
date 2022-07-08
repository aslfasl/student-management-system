package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class StudentManagementSystemApplication implements CommandLineRunner {

    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student( "Bruce", "Wayne", "batman@dc.com");
//        Student student2 = new Student( "Peter", "Parker", "spiderman@mu.com");
//        Student student3 = new Student( "Clark", "Kent", "superman@dc.com");
//
//        studentRepository.save(student1);
//        studentRepository.save(student2);
//        studentRepository.save(student3);
    }
}
