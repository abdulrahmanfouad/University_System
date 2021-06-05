package com.university.Repositories;

import com.university.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


    Student findById(int id);
    Student findByEmail(String email);

    Student getOne(int id);
}
