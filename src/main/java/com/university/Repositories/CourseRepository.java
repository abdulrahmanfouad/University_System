package com.university.Repositories;

import com.university.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

    Course findCourseById(String id);
    List<Course> findAllByInstructorId(int instructorId);
    Course getOne(String id);
}
