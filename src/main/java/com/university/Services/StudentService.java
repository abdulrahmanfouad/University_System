package com.university.Services;
import com.university.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


import java.util.List;
@Bean
public interface StudentService {
    void addStudents(Student student);
    List<Student> getStudents();
    Student getStudent(int id);
    void updateStudent(Student student, int id);
    void deleteStudent(int id);

}
