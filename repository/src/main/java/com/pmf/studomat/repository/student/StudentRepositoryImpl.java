package com.pmf.studomat.repository.student;

import com.pmf.studomat.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

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

    @Override
    public List<Student> getStudents(Integer page, Integer pageSize) {
        String query = "SELECT * FROM student LIMIT ? OFFSET ?";

        return this.jdbcTemplate.query(query, new StudentRowMapper(), pageSize, (page-1)*pageSize);
    }

    @Override
    public Student createStudent(String firstName, String lastName, String jmbag) {
        String query = "INSERT INTO student (firstname, lastname, jmbag) VALUES (?, ?, ?)";
        KeyHolder holder = new GeneratedKeyHolder();

        Integer id = this.jdbcTemplate.update(connection ->
                connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS),
                holder);

        return this.getStudentById(id);
    }

    @Override
    public Integer deleteStudent(Integer id) {

        String query = "DELETE FROM student WHERE id = ?";

        this.jdbcTemplate.update(query, id);

        return id;
    }
}
