package com.pmf.studomat.repository.collegeEnrollment;

import com.pmf.studomat.entities.CollegeEnrollment;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class CollegeEnrollmentRepositoryImpl implements CollegeEnrollmentRepository{

    private JdbcTemplate jdbcTemplate;

    public CollegeEnrollmentRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public CollegeEnrollment getCollegeEnrollmentById(Integer id) {
        String query = "SELECT * FROM college_enrollment WHERE id = ?";
        return this.jdbcTemplate.queryForObject(query, new CollegeEnrollmentRowMapper(), id);
    }

    @Override
    public CollegeEnrollment createCollegeEnrollment(Integer studentId, Integer collegeId, Integer year) {
        String query = "INSERT INTO college_enrollment (student_id, college_id, year) VALUES (?, ?, ?)";
        KeyHolder holder = new GeneratedKeyHolder();

        Integer id = this.jdbcTemplate.update(connection -> {
                    PreparedStatement ps = connection.prepareStatement(query, new String[]{"id"});
                    ps.setInt(1, studentId);
                    ps.setInt(2, collegeId);
                    ps.setInt(3, year);
                    return ps;
                },
                holder);
        return this.getCollegeEnrollmentById(id);
    }

    @Override
    public Integer deleteCollegeEnrollment(Integer id) {
        String query = "DELETE FROM college_enrollment WHERE id = ?";
        this.jdbcTemplate.update(query, id);
        return id;
    }

    @Override
    public Integer avgGrade(Integer year) {
        String query = "SELECT AVG(course_enrollment.grade) FROM college_enrollment INNER JOIN " +
                "course_enrollment ON college_enrollment.student_id = course_enrollment.student_id INNER JOIN " +
                "course ON course_enrollment.course_id = course.id WHERE course.year = ?";
        return DataAccessUtils.intResult(this.jdbcTemplate.query(query, new SingleColumnRowMapper<Integer>(), year));
    }

    @Override
    public Integer avgStudentGrade(Integer year, Integer studentId) {
        String query = "SELECT AVG(course_enrollment.grade) FROM college_enrollment INNER JOIN " +
                "course_enrollment ON college_enrollment.student_id = course_enrollment.student_id INNER JOIN " +
                "course ON course_enrollment.course_id = course.id WHERE course.year = ? AND college_enrollment.student_id = ?";
        return DataAccessUtils.intResult(this.jdbcTemplate.query(query, new SingleColumnRowMapper<Integer>(), year, studentId));
    }
}
