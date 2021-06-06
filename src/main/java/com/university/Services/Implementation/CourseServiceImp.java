package com.university.Services.Implementation;

import com.university.Entities.Course;
import com.university.Repositories.CourseRepository;
import com.university.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private final CourseRepository courseRepository;

    public CourseServiceImp(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void addCourses(Course course) {
        courseRepository.save(course);
    }

    @Override
    public List<Course> getCourses() {
        List<Course> courseList = new ArrayList<>();
        courseRepository.findAll().forEach(courseList::add);
        return courseList;
    }

    @Override
    public Course getCourse(String id) {
        return courseRepository.findCourseById(id);
    }

    @Override
    public void updateCourse(Course course, String id) {
        Course course1 = courseRepository.getOne(id);

        course1.setName(course.getName());
        course1.setDepartment(course.getDepartment());
        course1.setCreditHours(course.getCreditHours());
        course1.setYear(course.getYear());

        courseRepository.save(course1);
    }

    @Override
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
