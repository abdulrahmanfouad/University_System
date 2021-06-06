package com.university.Repositories;

import com.university.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

    Course findCourseById(String id);
    Course getOne(String id);
}
