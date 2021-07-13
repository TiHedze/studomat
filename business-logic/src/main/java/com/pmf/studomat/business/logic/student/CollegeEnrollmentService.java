package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.CollegeEnrollment;

public interface CollegeEnrollmentService {
    CollegeEnrollment getById(Integer id);
    CollegeEnrollment create(Integer studentId, Integer collegeId, Integer year);
    Integer deleteById(Integer id);
    Integer avgGrade(Integer year);
    Integer avgStudentGrade(Integer year, Integer studentId);
}
