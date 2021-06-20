package com.pmf.studomat.repository;

import com.pmf.studomat.repository.datasource.PostgreSql;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


@Repository
public class PostgreSqlPredmetDao implements PredmetDao {

    private static final PostgreSql DB = PostgreSql.getInstance();

    public PostgreSqlPredmetDao() {}

    @Override
    public void insertPredmet() {
    }

    @Override
    public void deletePredmet(int id) {

    }

    @Override
    public long getPredmetOib(int id) throws SQLException {
        PreparedStatement stmt = DB.getPreparedStatement("SELECT oib FROM predmet WHERE id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getLong("oib");
    }

    @Override
    public String getPredmetName(int id) throws SQLException {
        PreparedStatement stmt = DB.getPreparedStatement("SELECT naziv_predmeta FROM predmet WHERE id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getString("naziv_predmeta");
    }

    @Override
    public int getPredmetEcts(int id) throws SQLException {
        PreparedStatement stmt = DB.getPreparedStatement("SELECT ects FROM predmet WHERE id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getInt("ects");
    }

    @Override
    public String getPredmetSemestar(int id) throws SQLException {
        PreparedStatement stmt = DB.getPreparedStatement("SELECT semestar FROM predmet WHERE id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getString("semestar");
    }
}
