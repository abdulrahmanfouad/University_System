package com.university.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Instructors",schema = "public")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "office")
    private String office;
    @Column(name = "department")
    private String department;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "instructor")
    private Set<Course> courses;

    public Instructor() {
    }

    public Instructor(Integer id, String name, String office, String department) {
        this.id = id;
        this.name = name;
        this.office = office;
        this.department = department;
    }

    public Instructor(String name, String office, String department) {
        this.name = name;
        this.office = office;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
