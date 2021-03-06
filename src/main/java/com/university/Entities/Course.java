package com.university.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Courses", schema = "public")
public class Course {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "department", nullable = false)
    private String department;
    @Column(name = "credit_Hours")
    private int creditHours;
    @Column(name = "year")
    private int year;
    @OneToOne(cascade = CascadeType.ALL)
    private Book book;


    @ManyToOne
    private Instructor instructor;
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    public Course() {
    }

    public Course(String name, String department, int creditHours, int year, Instructor instructor) {
        this.name = name;
        this.department = department;
        this.creditHours = creditHours;
        this.year = year;
        this.instructor = instructor;
    }

    public Course(String id, String name, String department, int creditHours, int year) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.creditHours = creditHours;
        this.year = year;
    }

    public Course(String id, String name, String department, int creditHours, int year, Book book, Instructor instructor) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.creditHours = creditHours;
        this.year = year;
        this.book = book;
        this.instructor = instructor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


}
