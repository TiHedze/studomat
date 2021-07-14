package com.pmf.studomat.business.logic.course;

import com.pmf.studomat.entities.CourseEnrollment;

public interface CourseEnrollmentService {
    CourseEnrollment getById(Integer id);
    CourseEnrollment create(Integer studentId, Integer courseId, Integer grade);
    CourseEnrollment create(Integer studentId, Integer courseId);
    Integer delete(Integer id);
    Integer setGrade(Integer id, Integer grade);
    Integer avgGrade(Integer year);
}
