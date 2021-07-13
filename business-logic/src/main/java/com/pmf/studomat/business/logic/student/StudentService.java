package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.Student;
import org.springframework.stereotype.Service;

public interface StudentService {

    Student getById(Integer id);
}
