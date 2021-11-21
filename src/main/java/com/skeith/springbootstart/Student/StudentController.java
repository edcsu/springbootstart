package com.skeith.springbootstart.Student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/students")
public class StudentController {

    public List<Student> GetStudents(){
        return List.of(
                new Student(
                        1L,
                        "John Doe",
                        "johndoe@gmail.com",
                        LocalDate.of(1980, Month.JANUARY, 16),
                        30
                )
        );
    }
}
