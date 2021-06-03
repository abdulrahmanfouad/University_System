package com.university.Controllers;

import com.university.Entities.Student;
import com.university.Services.StudentService;
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
        return students;
    }

    @GetMapping("/Students/{id}")
    public Student getStudent(@PathVariable int id){
        return students.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }
    @PostMapping("/Students")
    public void addStudents(@RequestBody Student student){
        students.add(student);
        //studentService.addStudents(student);
    }
    @PutMapping("/Students/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable int id){
        for (int i = 0; i< students.size(); i++){
            Student s = students.get(i);
            if (s.getId().equals(id)){
                students.set(i, student);
                return;
            }
        }
    }
    @DeleteMapping("/Students/{id}")
    public void deleteStudent(@PathVariable int id){
        students.removeIf(t -> t.getId().equals(id));
    }
}
