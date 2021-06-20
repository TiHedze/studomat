package com.pmf.studomat.business.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmf.studomat.repository.PostgreSqlPredmetDao;

import java.sql.SQLException;

@Service
public class PredmetServiceImpl implements PredmetService {

    private final PostgreSqlPredmetDao predmetDao;

    @Autowired
    public PredmetServiceImpl(PostgreSqlPredmetDao predmetDao) {
        this.predmetDao = predmetDao;
    }

    @Override
    public String getPredmetName(int id) throws SQLException {
        return predmetDao.getPredmetName(id);
    }

    @Override
    public long getPredmetOib(int id) throws SQLException {
        return predmetDao.getPredmetOib(id);
    }

    @Override
    public int getPredmet(int id) {
        return 0;
    }

    @Override
    public int getPredmetEcts(int id) throws SQLException {
        return predmetDao.getPredmetEcts(id);
    }

    @Override
    public String getPredmetSemestar(int id) throws SQLException {
        return predmetDao.getPredmetSemestar(id);
    }
}