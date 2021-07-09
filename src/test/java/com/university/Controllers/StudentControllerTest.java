package com.university.Controllers;
import com.university.Entities.Student;
import javassist.NotFoundException;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Test
    @Order(4)
    void getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        studentController.getAllStudents().forEach(studentList::add);
        assertNotNull(studentList);
    }

    @Test
    @Order(3)
    void getStudentById() {
        assertEquals(1000,studentController.getStudentByEmail("ah@gmail.com").getId());
    }

    @Test
    @Order(2)
    void getStudentByEmail() {
        assertEquals("ff@gmail.com",studentController.getStudentById(2000).getEmail());
    }

    @Test
    @Order(1)
    void addStudents() {
        Student student = new Student(1100,"Ali","Ahmed","aliahmed@gmail.com",20,"Cairo");
        studentController.addStudents(student);
        assertEquals("Ali",studentController.getStudentByEmail("aliahmed@gmail.com").getFirstName());
    }

    @Test
    @Order(5)
    void updateStudent() throws NotFoundException {
        Student student = new Student(3000,"Mohamed","Fouad","mf@gmail.com",21,"Giza");
        studentController.updateStudent(student,3000);
        assertEquals("Fouad",studentController.getStudentById(3000).getLastName());
    }

    @Test
    @Order(6)
    void deleteStudent() {
        Student student = studentController.getStudentById(4000);
        studentController.deleteStudent(student.getId());
        assertNull(studentController.getStudentById(4000));
    }
}