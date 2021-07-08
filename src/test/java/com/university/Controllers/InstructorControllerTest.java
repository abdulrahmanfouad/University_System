package com.university.Controllers;

import com.university.Entities.Instructor;
import javassist.NotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class InstructorControllerTest {

    @Autowired
    private InstructorController instructorController;

    @Test
    @Order(2)
    void getAllInstructors() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorController.getAllInstructors().forEach(instructorList::add);
        assertNotNull(instructorList);
    }

    @Test
    @Order(3)
    void getInstructorById() {
        assertEquals("Third Floor",instructorController.getInstructorById(200).getOffice());
    }

    @Test
    @Order(4)
    void getInstructorByDepartment() {
        List<Instructor> instructors = new ArrayList<>();
        instructorController.getInstructorByDepartment("Computer Science").forEach(instructors::add);
        assertNotNull(instructors);
    }

    @Test
    @Order(1)
    void addInstructors() {
        Instructor instructor = new Instructor(410,"Sayed Ahmed","Second Floor","Physics");
        instructorController.addInstructors(instructor);
        assertEquals("Physics",instructorController.getInstructorById(410).getDepartment());
    }

    @Test
    @Order(5)
    void updateInstructor() throws NotFoundException {
        Instructor instructor = new Instructor(300,"Ali Karam","Fourth Floor","Chemistry");
        instructorController.updateInstructor(instructor,300);
        assertEquals("Ali Karam",instructorController.getInstructorById(300).getName());
    }

    @Test
    @Order(6)
    void deleteInstructor() {
        Instructor instructor = instructorController.getInstructorById(400);
        instructorController.deleteInstructor(instructor.getId());
        assertNull(instructorController.getInstructorById(400));
    }
}