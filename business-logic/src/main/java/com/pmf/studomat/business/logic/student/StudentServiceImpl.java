package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.Student;
import org.springframework.stereotype.Service;
import com.pmf.studomat.repository.student.StudentRepository;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

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

    @Override
    public Student createStudent(String firstName, String lastName) {
        var jmbag = UUID.randomUUID().toString();
        return this.studentRepository.createStudent(firstName, lastName,jmbag );
    }

    @Override
    public List<Student> getStudents(Integer page, Integer pageSize) {
        return this.studentRepository.getStudents(page, pageSize);
    }
}
