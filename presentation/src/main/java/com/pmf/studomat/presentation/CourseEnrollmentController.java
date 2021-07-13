package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.student.CourseEnrollmentService;
import com.pmf.studomat.entities.CourseEnrollment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/create/{studentId}/{courseId}/{grade}")
    public CourseEnrollment create(@PathVariable Integer studentId, @PathVariable Integer courseId, @PathVariable Integer grade) {
        return this.courseEnrollmentService.create(studentId, courseId, grade);
    }

    @GetMapping("/create/{studentId}/{courseId}")
    public CourseEnrollment create(@PathVariable Integer studentId, @PathVariable Integer courseId) {
        return this.courseEnrollmentService.create(studentId, courseId);
    }

    @GetMapping("/delete/{id}")
    public Integer delete(@PathVariable Integer id) {
        return this.courseEnrollmentService.delete(id);
    }

    @GetMapping("/setGrade/{id}/{grade}")
    public Integer setGrade(@PathVariable Integer id, @PathVariable Integer grade) {
        return this.courseEnrollmentService.setGrade(id, grade);
    }

    @GetMapping("/avgGrade/{year}")
    public Integer avgGrade(@PathVariable Integer year) {
        return this.courseEnrollmentService.avgGrade(year);
    }
}
