package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.CourseEnrollment;
import com.pmf.studomat.repository.courseEnrollment.CourseEnrollmentRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {

    private CourseEnrollmentRepository courseEnrollmentRepository;

    public CourseEnrollmentServiceImpl(CourseEnrollmentRepository courseEnrollmentRepository) {
        this.courseEnrollmentRepository = courseEnrollmentRepository;
    }

    @Override
    public CourseEnrollment getById(Integer id) {
        return this.courseEnrollmentRepository.getCourseEnrollmentById(id);
    }

    @Override
    public CourseEnrollment create(Integer studentId, Integer courseId, Integer grade) {
        return this.courseEnrollmentRepository.createCourseEnrollment(studentId, courseId, grade);
    }

    @Override
    public CourseEnrollment create(Integer studentId, Integer courseId) {
        return this.create(studentId, courseId, -1);
    }

    @Override
    public Integer delete(Integer id) {
        return this.courseEnrollmentRepository.deleteCourseEnrollment(id);
    }

    @Override
    public Integer setGrade(Integer id, Integer grade) {
        return this.courseEnrollmentRepository.setGrade(id, grade);
    }

    @Override
    public Integer avgGrade(Integer year) {
        return this.courseEnrollmentRepository.avgGrade(year);
    }
}
