package com.pmf.studomat.business.logic.student;

import com.pmf.studomat.entities.College;
import org.springframework.stereotype.Service;

public interface CollegeService {

    College getById(Integer id);
    Integer deleteById(Integer id);
    College create(Integer universityId, String name);
}
