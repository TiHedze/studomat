package com.pmf.studomat.repository.university;

import com.pmf.studomat.entities.University;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UniversityRowMapper implements RowMapper<University> {
    @Override
    public University mapRow(ResultSet rs, int rowNum) throws SQLException {
        University university = new University();

        university.setId(rs.getInt("id"));
        university.setName(rs.getString("name"));

        return university;
    }
}
