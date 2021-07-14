package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.course.CourseEnrollmentService;
import com.pmf.studomat.entities.CourseEnrollment;
import com.pmf.studomat.entities.requests.CourseEnrollmentRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courseEnrollment")
public class CourseEnrollmentController {

    private CourseEnrollmentService courseEnrollmentService;

    public CourseEnrollmentController(CourseEnrollmentService courseEnrollmentService) {
        this.courseEnrollmentService = courseEnrollmentService;
    }

    @GetMapping("/{id}")
    public CourseEnrollment getById(@PathVariable Integer id) {
        return this.courseEnrollmentService.getById(id);
    }

    @PostMapping
    public CourseEnrollment enroll(@RequestBody CourseEnrollmentRequest request) {
        return this.courseEnrollmentService.create(request.studentId, request.collegeId);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return this.courseEnrollmentService.delete(id);
    }

    @PutMapping("/setGrade/{id}/{grade}")
    public Integer setGrade(@PathVariable Integer id, @PathVariable Integer grade) {
        return this.courseEnrollmentService.setGrade(id, grade);
    }

    @GetMapping("/avgGrade/{year}")
    public Integer avgGrade(@PathVariable Integer year) {
        return this.courseEnrollmentService.avgGrade(year);
    }
}
