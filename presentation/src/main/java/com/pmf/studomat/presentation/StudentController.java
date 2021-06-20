package com.pmf.studomat.presentation;

import com.pmf.studomat.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pmf.studomat.business.logic.student.StudentService;

@RestController
@RequestMapping("api/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService testService)
    {
        this.studentService = testService;
    }

    @GetMapping
    public Student getStudent()
    {
        return this.getStudentById(1);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id)
    {
        return this.studentService.getById(id);
    }
}
