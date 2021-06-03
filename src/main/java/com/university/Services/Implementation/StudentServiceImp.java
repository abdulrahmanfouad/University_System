package com.university.Services.Implementation;

import com.university.Entities.Student;
import com.university.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp {

    private final StudentRepository studentRepository;


    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudents(Student student){
        studentRepository.save(student);
    }



}
