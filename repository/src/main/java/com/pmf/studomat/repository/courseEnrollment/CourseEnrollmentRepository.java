package com.pmf.studomat.repository.courseEnrollment;

import com.pmf.studomat.entities.CollegeEnrollment;
import com.pmf.studomat.entities.CourseEnrollment;

public interface CourseEnrollmentRepository {

    CourseEnrollment getCourseEnrollmentById(Integer id);
    CourseEnrollment createCourseEnrollment(Integer studentId, Integer courseId, Integer grade);
    Integer deleteCourseEnrollment(Integer id);
    Integer setGrade(Integer id, Integer grade);
    Integer avgGrade(Integer year);
}
