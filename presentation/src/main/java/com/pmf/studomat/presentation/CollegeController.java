package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.college.CollegeService;
import com.pmf.studomat.entities.College;
import com.pmf.studomat.entities.requests.CollegeCreateRequest;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    public Integer deleteCollegeById(@PathVariable Integer id) {
        return this.collegeService.deleteById(id);
    }

    @PostMapping
    public College createCollege(@RequestBody CollegeCreateRequest request) {
        return this.collegeService.create(request.universityId, request.name);
    }
}
