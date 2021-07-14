package com.pmf.studomat.business.logic.university;

import com.pmf.studomat.entities.University;
import com.pmf.studomat.repository.university.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    private UniversityRepository repository;

    public UniversityServiceImpl(UniversityRepository repository) {
        this.repository = repository;
    }

    @Override
    public University createUniversity(String universityName) {
        return this.repository.createUniversity(universityName);
    }

    @Override
    public Integer deleteUniversity(Integer id) {
       return this.repository.deleteUniversity(id);
    }

    @Override
    public University updateUniversity(Integer id, String universityName) {
        return this.repository.updateUniversity(id, universityName);
    }

    @Override
    public University getById(Integer id) {
        return this.repository.getUniversityById(id);
    }

    @Override
    public List<University> getUniversities() {
        return null;
    }
}
