package com.university;

import com.university.Entities.Book;
import com.university.Entities.Course;
import com.university.Entities.Instructor;
import com.university.Entities.Student;
import com.university.Repositories.BookRepository;
import com.university.Repositories.CourseRepository;
import com.university.Repositories.InstructorRepository;
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
        @Autowired
        private CourseRepository courseRepository;
        @Autowired
        private InstructorRepository instructorRepository;
        @Autowired
        private BookRepository bookRepository;

        @Override
        public void run(String... args) throws Exception {
            // insertion of some students for Testing
            Student student1 = new Student(1000, "Ahmed", "Hassan", "ah@gmail.com", 20, "Cairo");
            studentRepository.save(student1);
            Student student2 = new Student(2000, "Fady", "Farid", "ff@gmail.com", 20, "Giza");
            studentRepository.save(student2);
            Student student3 = new Student(3000, "Mohamed", "Hady", "mh@gmail.com", 20, "Cairo");
            studentRepository.save(student3);
            Student student4 = new Student(4000, "Khaled", "Ali", "ka@gmail.com", 20, "Cairo");
            studentRepository.save(student4);
            // insertion of some courses for Testing
            Course course1 = new Course("M201", "Calculus 3", "Mathematics", 4, 2);
            courseRepository.save(course1);
            Course course2 = new Course("Chem101","General Chemistry","Chemistry",3,1);
            courseRepository.save(course2);
            Course course3 = new Course("Phys301","Advanced Physics","Physics",2,3);
            courseRepository.save(course3);
            Course course4 = new Course("CS401", "Network","Computer Science",3,4);
            courseRepository.save(course4);
            // insertion of some instructors for Testing
            Instructor instructor1 = new Instructor(100,"Ahmed Mahmoud","Second Floor","Computer Science");
            instructorRepository.save(instructor1);
            Instructor instructor2 = new Instructor(200,"Mohamed Badr","Third Floor","Computer Science");
            instructorRepository.save(instructor2);
            Instructor instructor3 = new Instructor(300,"Ali Karam","First Floor","Chemistry");
            instructorRepository.save(instructor3);
            Instructor instructor4 = new Instructor(400,"Mahmoud Hassan","Second Floor","Mathematics");
            instructorRepository.save(instructor4);
            // insertion of some books for Testing
            Book book1 = new Book(101,"Introduction to Programming","Author1");
            bookRepository.save(book1);
            Book book2 = new Book(201,"OOP","Author2");
            bookRepository.save(book2);
            Book book3 = new Book(302, "Computer Logic", "Author3");
            bookRepository.save(book3);
            Book book4 = new Book(408, "AI","Author4");
            bookRepository.save(book4);
        }
    }


