package com.pmf.studomat.repository.student;

import com.pmf.studomat.entities.Student;

public interface StudentRepository {

    Student getStudentById(Integer id);
}
