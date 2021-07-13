package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.student.CollegeEnrollmentService;
import com.pmf.studomat.entities.CollegeEnrollment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/collegeEnrollment")
public class CollegeEnrollmentController {

    private CollegeEnrollmentService collegeEnrollmentService;

    public CollegeEnrollmentController(CollegeEnrollmentService collegeEnrollmentService) {
        this.collegeEnrollmentService = collegeEnrollmentService;
    }

    @GetMapping("/{id}")
    public CollegeEnrollment getById(@PathVariable Integer id) {
        return this.collegeEnrollmentService.getById(id);
    }

    @GetMapping("/create/{studentId}/{collegeId}/{year}")
    public CollegeEnrollment create(@PathVariable Integer studentId, @PathVariable Integer collegeId, @PathVariable Integer year) {
        return this.collegeEnrollmentService.create(studentId, collegeId, year);
    }

    @GetMapping("/delete/{id}")
    public Integer deleteById(@PathVariable Integer id) {
        return this.collegeEnrollmentService.deleteById(id);
    }

    @GetMapping("/avgGrade/{year}")
    public Integer avgGrade(@PathVariable Integer year) {
        return this.collegeEnrollmentService.avgGrade(year);
    }

    @GetMapping("/avgGrade/{year}/{studentId}")
    public Integer avgStudentGrade(Integer year, Integer studentId) {
        return this.collegeEnrollmentService.avgStudentGrade(year, studentId);
    }
}
