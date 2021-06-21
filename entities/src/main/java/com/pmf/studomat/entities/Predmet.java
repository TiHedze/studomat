package com.pmf.studomat.entities;

public class Predmet {
    private Integer id;
    private Integer ects;
    private Long oib;
    private String nazivPredmeta;
    private String semestar;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public Long getOib() {
        return oib;
    }

    public void setOib(Long oib) {
        this.oib = oib;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getSemestar() {
        return semestar;
    }

    public void setSemestar(String semestar) {
        this.semestar = semestar;
    }
}
