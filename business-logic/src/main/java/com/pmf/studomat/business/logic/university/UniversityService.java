package com.pmf.studomat.business.logic.university;

import com.pmf.studomat.entities.University;

import java.util.List;

public interface UniversityService {
    University createUniversity(String universityName);
    Integer deleteUniversity(Integer id);
    University updateUniversity(Integer id, String universityName);
    University getById(Integer id);
    List<University> getUniversities();
}
