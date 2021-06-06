package com.university.Services;

import com.university.Entities.Instructor;

import java.util.List;

public interface InstructorService {
    void addInstructors(Instructor instructor);
    List<Instructor> getInstructors();
    Instructor getInstructorById(int id);
    List<Instructor> getInstructorByDepartment(String department);
    void updateInstructor(Instructor instructor, int id);
    void deleteInstructor(int id);
}
