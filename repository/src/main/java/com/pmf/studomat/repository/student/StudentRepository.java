package com.pmf.studomat.repository.student;

import com.pmf.studomat.entities.Student;

import java.util.List;

public interface StudentRepository {

    Student getStudentById(Integer id);
    List<Student> getStudents(Integer page, Integer pageSize);
    Student createStudent(String firstName, String lastName, String jmbag);
    Integer deleteStudent(Integer id);

}
