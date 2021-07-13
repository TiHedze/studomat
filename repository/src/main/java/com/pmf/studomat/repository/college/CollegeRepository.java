package com.pmf.studomat.repository.college;

import com.pmf.studomat.entities.College;

import java.util.List;

public interface CollegeRepository {

    College getCollegeById(Integer id);
    List<College> getColleges(Integer page, Integer pageSize);
    College createCollege(Integer universityId, String name);
    Integer deleteCollege(Integer id);

}
