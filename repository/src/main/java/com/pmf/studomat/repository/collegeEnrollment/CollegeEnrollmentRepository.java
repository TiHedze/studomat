package com.pmf.studomat.repository.collegeEnrollment;

import com.pmf.studomat.entities.CollegeEnrollment;

public interface CollegeEnrollmentRepository {

    CollegeEnrollment getCollegeEnrollmentById(Integer id);
    CollegeEnrollment createCollegeEnrollment(Integer studentId, Integer collegeId, Integer year);
    Integer deleteCollegeEnrollment(Integer id);
    Integer avgGrade(Integer year);
    Integer avgStudentGrade(Integer year, Integer studentId);
}
