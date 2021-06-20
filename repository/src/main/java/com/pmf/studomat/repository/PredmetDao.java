package com.pmf.studomat.repository;

import java.sql.SQLException;

public interface PredmetDao {
    void insertPredmet();
    void deletePredmet(int id);
    long getPredmetOib(int id) throws SQLException;
    String getPredmetName(int id) throws SQLException;
    int getPredmetEcts(int id) throws SQLException;
    String getPredmetSemestar(int id) throws SQLException;
}
