package com.university.Entities;

public class Instructor {

    private String name;
    private String office;
    private String rank;

    public Instructor() {
    }

    public Instructor(String name, String office, String rank) {
        this.name = name;
        this.office = office;
        this.rank = rank;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
