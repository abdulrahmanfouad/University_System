package com.university.Services.Implementation;

import com.university.Entities.Student;
import com.university.Repositories.StudentRepository;
import com.university.Services.StudentService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
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
        return studentRepository.findByEmail(email);
    }

    @Override
    public void updateStudent(Student student, int id) throws NotFoundException {
        Student student1 = studentRepository.getOne(id);
        if (student1.getId().equals(student.getId())){
            student.setFirstName(student1.getFirstName());
            student.setLastName(student1.getLastName());
            student.setEmail(student1.getEmail());
            student.setAge(student1.getAge());
            student.setAddress(student1.getAddress());
        }
        else
            throw new NotFoundException("Student Not Found");
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }


}
