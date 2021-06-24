package com.university.Controllers;

import com.university.Entities.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    StudentController studentController;


    @BeforeEach
    void setUp() {
        Student student = new Student();
    }

    @Test
    void getAllStudents() {
        List<Student> studentList = studentController.getAllStudents();
        assertEquals(,studentList,);
    }

    @Test
    void getStudentById() {
    }

    @Test
    void getStudentByEmail() {
    }

    @Test
    void addStudents() {
    }

    @Test
    void updateStudent() {
    }

    @Test
    void deleteStudent() {
    }
}