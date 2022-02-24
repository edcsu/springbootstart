package com.skeith.springbootstart.Student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {

    public ResponseEntity<List<Student>> GetStudents(){
        List<Student> studentList = List.of(
                new Student(
                        1L,
                        "John Doe",
                        "johndoe@gmail.com",
                        LocalDate.of(1980, Month.JANUARY, 16),
                        30
                )
        );
        return ResponseEntity.ok(studentList);
    }
}
