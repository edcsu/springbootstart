package com.skeith.springbootstart;

import com.skeith.springbootstart.Student.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = StudentController.class)
public class SpringbootstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootstartApplication.class, args);
    }

}
