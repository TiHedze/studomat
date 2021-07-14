package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.Student;

import java.util.List;

public interface StudentService {

    Student getById(Integer id);
    Student createStudent(String firstName, String lastName);
    List<Student> getStudents(Integer page, Integer pageSize);
}
