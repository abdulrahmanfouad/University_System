package com.university.Controllers;

import com.university.Entities.Student;
import com.university.Services.StudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    private List<Student> students = new ArrayList<>( Arrays.asList(
            new Student(1,"Ahmed","Ali","ahmed@gmail.com",20,"Cairo"),
            new Student(2,"Akram","Mohamed","akram@gmail.com",21,"Giza"),
            new Student(3,"Mohamed","Fouad","mido@gmail.com",23,"Alexandria")
    ));



    @GetMapping("/Students")
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/Students/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/Students/{email}")
    public Student getStudentByEmail(@PathVariable String email){
        return studentService.getStudentByEmail(email);
    }
    @PostMapping("/Students")
    public void addStudents(@RequestBody Student student){
        studentService.addStudents(student);
    }
    @PutMapping("/Students/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable int id) throws NotFoundException {
        studentService.updateStudent(student,id);
    }
    @DeleteMapping("/Students/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
