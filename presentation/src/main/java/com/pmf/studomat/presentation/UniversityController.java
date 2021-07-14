package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.university.UniversityService;
import com.pmf.studomat.entities.University;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/university")
public class UniversityController {

    private UniversityService universityService;

    public UniversityController(UniversityService universityService)
    {
        this.universityService = universityService;
    }

    @GetMapping("/{id}")
    public University getById(@PathVariable Integer id)
    {
        return this.universityService.getById(id);
    }

    @GetMapping
    public List<University> getUniversities()
    {
        return this.universityService.getUniversities();
    }
}
