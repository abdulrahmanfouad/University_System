package com.university.Services.Implementation;

import com.university.Entities.Student;
import com.university.Repositories.StudentRepository;
import com.university.Services.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public void addStudents(Student student){
        studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentRepository.findAll().forEach(studentList::add);
        return studentList;
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return null;
    }

    @Override
    public void updateStudent(Student student, int id) {

    }

    @Override
    public void deleteStudent(int id) {

    }


}
