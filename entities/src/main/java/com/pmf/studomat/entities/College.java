package com.pmf.studomat.entities;

public class College {
    private Integer id;
    private Integer universityId;
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public Integer getUniversityId() {
        return this.universityId;
    }
}
