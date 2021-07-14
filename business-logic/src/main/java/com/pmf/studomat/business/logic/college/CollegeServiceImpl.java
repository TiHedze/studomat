package com.pmf.studomat.business.logic.college;

import com.pmf.studomat.entities.College;
import com.pmf.studomat.repository.college.CollegeRepository;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements CollegeService {

    private CollegeRepository collegeRepository;

    public CollegeServiceImpl(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    @Override
    public College getById(Integer id) {
        return this.collegeRepository.getCollegeById(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return this.collegeRepository.deleteCollege(id);
    }

    @Override
    public College create(Integer universityId, String name) {
        return this.collegeRepository.createCollege(universityId, name);
    }
}
