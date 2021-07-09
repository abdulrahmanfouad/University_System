package com.university.Controllers;


import com.university.Entities.Instructor;
import com.university.Services.InstructorService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructorController {

    @Autowired
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("/Instructors")
    public List<Instructor> getAllInstructors(){
        return instructorService.getInstructors();
    }

    @GetMapping("/Instructor/{id}")
    public Instructor getInstructorById(@PathVariable int id){
        return instructorService.getInstructorById(id);
    }

    @GetMapping("/Instructors/{department}")
    public List<Instructor> getInstructorByDepartment(@PathVariable String department){
        return instructorService.getInstructorByDepartment(department);
    }
    @PostMapping("/Instructors")
    public void addInstructors(@RequestBody Instructor instructor){
        instructorService.addInstructors(instructor);
    }
    @PutMapping("/Instructors/{id}")
    public void updateInstructor(@RequestBody Instructor instructor,@PathVariable int id) throws NotFoundException {
        instructorService.updateInstructor(instructor,id);
    }
    @DeleteMapping("/Instructors/{id}")
    public void deleteInstructor(@PathVariable int id){
        instructorService.deleteInstructor(id);
    }
}
