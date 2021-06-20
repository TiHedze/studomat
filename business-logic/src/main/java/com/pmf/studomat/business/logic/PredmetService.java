package com.pmf.studomat.business.logic;

import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public interface PredmetService {
    String getPredmetName(int id) throws SQLException;
    long getPredmetOib(int id) throws SQLException;
    int getPredmet(int id);
    int getPredmetEcts(int id) throws SQLException;
    String getPredmetSemestar(int id) throws SQLException;
}
