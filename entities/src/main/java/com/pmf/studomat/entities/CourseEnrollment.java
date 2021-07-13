package com.pmf.studomat.entities;

public class CourseEnrollment {
    private Integer id;
    private Integer studentId;
    private Integer year;
    private String name;
    private Integer grade;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return this.grade;
    }
}
