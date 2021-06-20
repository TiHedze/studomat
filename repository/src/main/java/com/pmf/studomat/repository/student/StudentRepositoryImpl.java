package com.pmf.studomat.repository.student;

import com.pmf.studomat.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.pmf.studomat.repository.rowmapper.StudentRowMapper;

import javax.sql.DataSource;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

    private JdbcTemplate jdbcTemplate;

    public StudentRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Student getStudentById(Integer id) {

        String query = "SELECT * FROM student WHERE ID = ?";
        return this.jdbcTemplate.queryForObject(query, new StudentRowMapper(), id);
    }
}
