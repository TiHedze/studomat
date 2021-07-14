package com.pmf.studomat.repository.university;

import com.pmf.studomat.entities.University;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class UniversityRepositoryImpl implements UniversityRepository{

    private JdbcTemplate jdbcTemplate;

    public UniversityRepositoryImpl(DataSource dataSource)
    {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public University createUniversity(String universityName) {
        String query = "INSERT INTO university (name) VALUES(?)";

        KeyHolder holder = new GeneratedKeyHolder();

        this.jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,universityName);
            return preparedStatement;}
            ,holder);

        return this.getUniversityById(holder.getKeyAs(Integer.class));
    }

    @Override
    public Integer deleteUniversity(Integer id) {
        String query = "DELETE FROM university WHERE id = ?";

        this.jdbcTemplate.update(query, id);

        return id;
    }

    @Override
    public University updateUniversity(Integer id, String universityName) {
        String query = "UPDATE university SET name = ? WHERE id = ?";

        this.jdbcTemplate.update(query, universityName, id);

        return this.getUniversityById(id);

    }

    @Override
    public University getUniversityById(Integer id) {
        String query = "SELECT * FROM university WHERE id = ?";

        return this.jdbcTemplate.queryForObject(query, new UniversityRowMapper(), id);
    }

    @Override
    public List<University> getUniversities() {
        String query = "SELECT * FROM university";

        return this.jdbcTemplate.query(query,new UniversityRowMapper());
    }
}
