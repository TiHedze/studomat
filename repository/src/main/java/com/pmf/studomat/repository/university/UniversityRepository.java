package com.pmf.studomat.repository.university;

import com.pmf.studomat.entities.University;

import java.util.List;

public interface UniversityRepository {
    University createUniversity(String universityName);
    Integer deleteUniversity(Integer id);
    University updateUniversity(Integer id, String universityName);
    University getUniversityById(Integer id);
    List<University> getUniversities();
}
