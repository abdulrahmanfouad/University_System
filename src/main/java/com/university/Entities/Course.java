package com.university.Entities;

public class Course {

    private Long id;
    private String name;
    private String department;
    private int creditHours;

    public Course() {
    }

    public Course(String name, String department, int creditHours) {
        this.name = name;
        this.department = department;
        this.creditHours = creditHours;
    }

    public Course(Long id, String name, String department, int creditHours) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.creditHours = creditHours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
