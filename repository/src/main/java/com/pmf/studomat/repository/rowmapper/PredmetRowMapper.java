package com.pmf.studomat.repository.rowmapper;

import com.pmf.studomat.entities.Predmet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PredmetRowMapper implements RowMapper<Predmet> {

    @Override
    public Predmet mapRow(ResultSet rs, int rowNum) throws SQLException {

        Predmet predmet = new Predmet();

        predmet.setId(rs.getInt("id"));
        predmet.setNazivPredmeta(rs.getString("naziv_predmeta"));
        predmet.setEcts(rs.getInt("ects"));
        predmet.setOib(rs.getLong("oib"));
        predmet.setSemestar(rs.getString("semestar"));

        return predmet;
    }
}
