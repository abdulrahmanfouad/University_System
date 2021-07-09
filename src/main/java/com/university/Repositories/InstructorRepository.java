package com.university.Repositories;

import com.university.Entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
    Instructor findById(int id);
    List<Instructor> findAllByDepartment(String department);

}
