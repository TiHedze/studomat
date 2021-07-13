package com.pmf.studomat.repository.college;

import com.pmf.studomat.entities.College;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CollegeRowMapper implements RowMapper<College> {
    @Override
    public College mapRow(ResultSet rs, int rowNum) throws SQLException {
        College college = new College();

        college.setId(rs.getInt("id"));
        college.setUniversityId(rs.getInt("university_id"));
        college.setName(rs.getString("name"));

        return college;
    }
}
