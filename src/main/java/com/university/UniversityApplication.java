package com.university;

import com.university.Entities.Student;
import com.university.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class UniversityApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniversityApplication.class, args);
    }
}
@Component
class DemoCommandLineRunner implements CommandLineRunner {

        @Autowired
        private StudentRepository studentRepository;

        @Override
        public void run(String... args) throws Exception {
            Student student1 = new Student(1000,"Ahmed","Hassan","ah@gmail.com",20,"Cairo");
            studentRepository.save(student1);
            Student student2 = new Student(2000,"Fady","Farid","ff@gmail.com",20,"Giza");
            studentRepository.save(student2);
            Student student3 = new Student(3000,"Mohamed","Hady","mh@gmail.com",20,"Cairo");
            studentRepository.save(student3);
            Student student4 = new Student(4000,"Khaled","Ali","ka@gmail.com",20,"Cairo");
            studentRepository.save(student4);
        }
    }


