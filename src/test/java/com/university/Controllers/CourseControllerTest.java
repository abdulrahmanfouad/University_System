package com.university.Controllers;
import com.university.Entities.Book;
import com.university.Entities.Course;
import com.university.Entities.Instructor;
import javassist.NotFoundException;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseControllerTest {

    @Autowired
    private CourseController courseController;

    @Test
    @Order(2)
    void getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        courseController.getAllCourses().forEach(courseList::add);
        assertNotNull(courseList);
    }

    @Test
    @Order(3)
    void getCourseById() {
        assertEquals("Network",courseController.getCourseById("CS401").getName());
    }

    @Test
    @Order(4)
    void getCourseByInstructorId() {
        List<Course> courses = new ArrayList<>();
        courseController.getCourseByInstructorId(200).forEach(courses::add);
        assertNotNull(courses);
    }

    @Test
    @Order(1)
    void addCourse() {
        Course course = new Course("CS302","Computer Logic","Computer Science",3,3);
        course.setInstructor(new Instructor(200,"Mohamed Badr","Third Floor","Computer Science"));
        course.setBook(new Book(302, "Computer Logic", "Author3"));
        courseController.addCourse(course);
        assertEquals(3,courseController.getCourseById("CS302").getCreditHours());
    }

    @Test
    @Order(5)
    void updateCourse() throws NotFoundException {
    Course course = new Course("M201","Practical Calculus","Mathematics",4,2);
    courseController.updateCourse(course,"M201");
    assertEquals(4,courseController.getCourseById("M201").getCreditHours());
    }

    @Test
    @Order(6)
    void deleteCourse() {
        Course course = courseController.getCourseById("Chem101");
        courseController.deleteCourse(course.getId());
        assertNull(courseController.getCourseById("Chem101"));
    }
}