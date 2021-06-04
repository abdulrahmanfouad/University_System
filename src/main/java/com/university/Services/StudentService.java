package com.university.Services;
import com.university.Entities.Student;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


import java.util.List;

public interface StudentService {
    void addStudents(Student student);
    List<Student> getStudents();
    Student getStudentById(int id);
    Student getStudentByEmail(String email);
    void updateStudent(Student student, int id) throws NotFoundException;
    void deleteStudent(int id);

}
