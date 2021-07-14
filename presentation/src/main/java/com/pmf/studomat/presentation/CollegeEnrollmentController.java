package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.college.CollegeEnrollmentService;
import com.pmf.studomat.entities.CollegeEnrollment;
import com.pmf.studomat.entities.requests.CollegeEnrollmentRequest;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public CollegeEnrollment create(@RequestBody CollegeEnrollmentRequest request) {
        return this.collegeEnrollmentService.create(request.studentId, request.collegeId, request.year);
    }

    @DeleteMapping("/{id}")
    public Integer deleteById(@PathVariable Integer id) {
        return this.collegeEnrollmentService.deleteById(id);
    }

    @GetMapping("/avgGrade/{year}")
    public Integer avgGrade(@PathVariable Integer year) {
        return this.collegeEnrollmentService.avgGrade(year);
    }

    @GetMapping("/avgGrade/{year}/{studentId}")
    public Integer avgStudentGrade(@PathVariable Integer year, @PathVariable Integer studentId) {
        return this.collegeEnrollmentService.avgStudentGrade(year, studentId);
    }
}
