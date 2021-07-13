package com.pmf.studomat.entities;

public class Course {
    private Integer id;
    private Integer collegeId;
    private String name;
    private Integer year;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getCollegeId() {
        return this.collegeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }
}
