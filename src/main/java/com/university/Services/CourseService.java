package com.university.Services;

import com.university.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    void addCourses(Course course);
    List<Course> getCourses();
    Course getCourse(String id);
    void updateCourse(Course course, String id);
    void deleteCourse(String id);
}
