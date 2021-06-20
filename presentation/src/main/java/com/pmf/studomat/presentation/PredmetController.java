package com.pmf.studomat.presentation;

import com.pmf.studomat.business.logic.PredmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/predmet")
public class PredmetController {

    private PredmetService predmetService;

    @Autowired
    public PredmetController(PredmetService predmetService) {
        this.predmetService = predmetService;
    }

    @GetMapping(path = "naziv/{id}")
    public String getPredmetName(@PathVariable("id") int id) {
        try {
            return this.predmetService.getPredmetName(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @GetMapping(path = "ects/{id}")
    public int getPredmetEcts(@PathVariable("id") int id) {
        try {
            return this.predmetService.getPredmetEcts(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }

    @GetMapping(path = "semestar/{id}")
    public String getPredmetSemestar(@PathVariable("id") int id) {
        try {
            return this.predmetService.getPredmetSemestar(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @GetMapping(path = "oib/{id}")
    public long getPredmetOib(@PathVariable("id") int id) {
        try {
            return this.predmetService.getPredmetOib(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return -1;
    }
}
