package com.pmf.studomat.repository.college;

import com.pmf.studomat.entities.College;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class CollegeRepositoryImpl implements CollegeRepository{

    private JdbcTemplate jdbcTemplate;

    public CollegeRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public College getCollegeById(Integer id) {

        String query = "SELECT * FROM college WHERE id = ?";
        return this.jdbcTemplate.queryForObject(query, new CollegeRowMapper(), id);
    }

    @Override
    public List<College> getColleges(Integer page, Integer pageSize) {
        String query = "SELECT * FROM college LIMIT ? OFFSET ?";
        return this.jdbcTemplate.query(query, new CollegeRowMapper(), pageSize, (page-1)*pageSize);
    }

    @Override
    public College createCollege(Integer universityId, String name) {
        String query = "INSERT INTO college (university_id, name) VALUES (?, ?)";
        KeyHolder holder = new GeneratedKeyHolder();

        Integer id = this.jdbcTemplate.update(connection -> {
                    PreparedStatement ps = connection.prepareStatement(query, new String[]{"id"});
                    ps.setInt(1, universityId);
                    ps.setString(2, name);
                    return ps;
                },
                holder);
        return this.getCollegeById(id);
    }

    @Override
    public Integer deleteCollege(Integer id) {
        String query = "DELETE FROM college WHERE id = ?";
        this.jdbcTemplate.update(query, id);
        return id;
    }
}
