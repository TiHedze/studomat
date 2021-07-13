package com.pmf.studomat.entities;

public class CollegeEnrollment {

    private Integer id;
    private Integer studentId;
    private Integer collegeId;
    private Integer year;

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

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getCollegeId() {
        return this.collegeId;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return this.year;
    }
}
