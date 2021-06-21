package com.pmf.studomat.business.logic.predmet;

import com.pmf.studomat.entities.Predmet;
import com.pmf.studomat.repository.predmet.PredmetRepository;
import org.springframework.stereotype.Service;

@Service
public class PredmetServiceImpl implements PredmetService {

    private PredmetRepository predmetRepository;

    public PredmetServiceImpl(PredmetRepository predmetRepository) {
        this.predmetRepository = predmetRepository;
    }

    @Override
    public Predmet getById(int id) {
        return this.predmetRepository.getPredmetById(id);
    }
}
