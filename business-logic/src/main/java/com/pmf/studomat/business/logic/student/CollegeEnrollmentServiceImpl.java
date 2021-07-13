package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.CollegeEnrollment;
import com.pmf.studomat.repository.collegeEnrollment.CollegeEnrollmentRepository;
import org.springframework.stereotype.Service;

@Service
public class CollegeEnrollmentServiceImpl implements CollegeEnrollmentService{

    private CollegeEnrollmentRepository collegeEnrollmentRepository;

    public CollegeEnrollmentServiceImpl(CollegeEnrollmentRepository collegeEnrollmentRepository) {
        this.collegeEnrollmentRepository = collegeEnrollmentRepository;
    }

    @Override
    public CollegeEnrollment getById(Integer id) {
        return this.collegeEnrollmentRepository.getCollegeEnrollmentById(id);
    }

    @Override
    public CollegeEnrollment create(Integer studentId, Integer collegeId, Integer year) {
        return this.collegeEnrollmentRepository.createCollegeEnrollment(studentId, collegeId, year);
    }

    @Override
    public Integer deleteById(Integer id) {
        return this.collegeEnrollmentRepository.deleteCollegeEnrollment(id);
    }

    @Override
    public Integer avgGrade(Integer year) {
        return this.collegeEnrollmentRepository.avgGrade(year);
    }

    @Override
    public Integer avgStudentGrade(Integer year, Integer studentId) {
        return this.collegeEnrollmentRepository.avgStudentGrade(year, studentId);
    }
}
