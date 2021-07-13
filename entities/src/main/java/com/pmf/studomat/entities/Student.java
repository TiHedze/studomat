package com.pmf.studomat.entities;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String jmbag;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getJmbag() {
        return this.jmbag;
    }

    public void setJmbag(String jmbag) {
        this.jmbag = jmbag;
    }
}
