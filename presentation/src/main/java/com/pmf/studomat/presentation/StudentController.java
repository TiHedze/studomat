package com.pmf.studomat.presentation;

import com.pmf.studomat.entities.Student;
import com.pmf.studomat.entities.requests.CreateStudentRequest;
import org.springframework.web.bind.annotation.*;
import com.pmf.studomat.business.logic.student.StudentService;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService testService)
    {
        this.studentService = testService;
    }

    @GetMapping
    public List<Student> getStudents(@RequestParam Integer page, @RequestParam Integer pageSize)
    {
        return this.studentService.getStudents(page, pageSize);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id)
    {
        return this.studentService.getById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody CreateStudentRequest request)
    {
        return this.studentService.createStudent(request.firstName, request.lastName);
    }
}
