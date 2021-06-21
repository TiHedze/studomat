package com.pmf.studomat.presentation;

import com.pmf.studomat.entities.Predmet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pmf.studomat.business.logic.predmet.PredmetService;

@RestController
@RequestMapping("api/predmet")
public class PredmetController {

    private PredmetService predmetService;

    public PredmetController(PredmetService testService)
    {
        this.predmetService = testService;
    }

    @GetMapping("/{id}")
    public Predmet getStudentById(@PathVariable Integer id)
    {
        return this.predmetService.getById(id);
    }
}
