package com.pmf.studomat.repository.courseEnrollment;

import com.pmf.studomat.entities.CourseEnrollment;
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
public class CourseEnrollmentRepositoryImpl implements CourseEnrollmentRepository{

    private JdbcTemplate jdbcTemplate;

    public CourseEnrollmentRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public CourseEnrollment getCourseEnrollmentById(Integer id) {
        String query = "SELECT * FROM course_enrollment WHERE id = ?";
        return this.jdbcTemplate.queryForObject(query, new CourseEnrollmentRowMapper(), id);
    }

    @Override
    public CourseEnrollment createCourseEnrollment(Integer studentId, Integer courseId, Integer grade) {
        String query = "INSERT INTO course_enrollment (student_id, course_id, grade) VALUES (?, ?, ?, ?)";
        KeyHolder holder = new GeneratedKeyHolder();

        Integer id = this.jdbcTemplate.update(connection -> {
                    PreparedStatement ps = connection.prepareStatement(query, new String[]{"id"});
                    ps.setInt(1, studentId);
                    ps.setInt(2, courseId);
                    ps.setInt(3, grade);
                    return ps;
                },
                holder);
        return this.getCourseEnrollmentById(id);
    }

    @Override
    public Integer deleteCourseEnrollment(Integer id) {
        String query = "DELETE FROM course_enrollment WHERE id = ?";
        this.jdbcTemplate.update(query, id);
        return id;
    }

    @Override
    public Integer setGrade(Integer id, Integer grade) {
        String query = "UPDATE course_enrollment SET grade = ? WHERE id = ?";
        this.jdbcTemplate.update(query, grade, id);
        return id;
    }

    @Override
    public Integer avgGrade(Integer year) {
        String query = "SELECT AVG(course_enrollment.grade) FROM course_enrollment INNER JOIN course " +
                "ON course_enrollment.course_id = course.id WHERE course.year = ?";
        return DataAccessUtils.intResult(this.jdbcTemplate.query(query, new SingleColumnRowMapper<Integer>(), year));
    }
}
