package com.university.Controllers;


import com.university.Entities.Course;
import com.university.Services.CourseService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @GetMapping("/Courses")
    public List<Course> getAllCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/Course/{id}")
    public Course getCourseById(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @GetMapping("/Courses/{instructorId}")
    public List<Course> getCourseByInstructorId(@PathVariable int instructorId){
        return courseService.getCoursesByInstructorId(instructorId);
    }

    @PostMapping("/Courses")
    public void addCourse(@RequestBody Course course){
        courseService.addCourses(course);
    }

    @PutMapping("/Courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String id) throws NotFoundException {
        courseService.updateCourse(course,id);
    }
    @DeleteMapping("/Courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
