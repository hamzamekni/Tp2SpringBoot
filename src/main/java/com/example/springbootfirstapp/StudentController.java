package com.example.springbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
// http://localhost:8080/student/1
// @PathVariable annotation
@GetMapping("/student/{firstName}/{lastName}/")
public Student studentPathVariable(@PathVariable("firstName") String
firstName,
@PathVariable("lastName") String lastName) {
return new Student(firstName, lastName);
}
}


