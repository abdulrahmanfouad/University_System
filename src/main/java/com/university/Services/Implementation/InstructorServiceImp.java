package com.university.Services.Implementation;

import com.university.Entities.Instructor;
import com.university.Repositories.InstructorRepository;
import com.university.Services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructorServiceImp implements InstructorService {

    @Autowired
    private final InstructorRepository instructorRepository;

    public InstructorServiceImp(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }


    @Override
    public void addInstructors(Instructor instructor) {
        instructorRepository.save(instructor);
    }

    @Override
    public List<Instructor> getInstructors() {
        List<Instructor> instructorList = new ArrayList<>();
        instructorRepository.findAll().forEach(instructorList::add);
        return instructorList;
    }

    @Override
    public Instructor getInstructorById(int id) {
        return instructorRepository.findById(id);
    }

    @Override
    public List<Instructor> getInstructorByDepartment(String department) {
        List<Instructor> instructorList = new ArrayList<>();
        instructorRepository.findAllByDepartment(department).forEach(instructorList::add);
        return instructorList;
    }

    @Override
    public void updateInstructor(Instructor instructor, int id) {
        Instructor instructor1 = instructorRepository.findById(id);
        instructor1.setName(instructor.getName());
        instructor1.setDepartment(instructor.getDepartment());
        instructor1.setOffice(instructor.getOffice());

        instructorRepository.save(instructor1);
    }

    @Override
    public void deleteInstructor(int id) {
        instructorRepository.deleteById(id);

    }
}
