package com.pmf.studomat.repository.predmet;

import com.pmf.studomat.entities.Predmet;
import com.pmf.studomat.repository.rowmapper.PredmetRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class PredmetRepositoryImpl implements PredmetRepository {

    private JdbcTemplate jdbcTemplate;

    public PredmetRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Predmet getPredmetById(int id) {

        String query = "SELECT * FROM predmet WHERE id = ?";
        return this.jdbcTemplate.queryForObject(query, new PredmetRowMapper(), id);
    }
}
