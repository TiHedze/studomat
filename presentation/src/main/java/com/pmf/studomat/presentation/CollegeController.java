package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.student.CollegeService;
import com.pmf.studomat.entities.College;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/college")
public class CollegeController {

    private CollegeService collegeService;

    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    @GetMapping
    public College getCollege() {
        return this.getCollegeById(1);
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Integer id) {
        return this.collegeService.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Integer deleteCollegeById(@PathVariable Integer id) {
        return this.collegeService.deleteById(id);
    }

    @GetMapping("/create/{universityId}/{name}")
    public College createCollege(@PathVariable Integer universityId, @PathVariable String name) {
        return this.collegeService.create(universityId, name);
    }
}
