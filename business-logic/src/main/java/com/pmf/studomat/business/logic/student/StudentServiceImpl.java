package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.Student;
import org.springframework.stereotype.Service;
import com.pmf.studomat.repository.student.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getById(Integer id) {
        return this.studentRepository.getStudentById(id);
    }
}
