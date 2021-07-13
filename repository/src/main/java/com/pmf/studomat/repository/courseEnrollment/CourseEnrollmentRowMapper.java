package com.pmf.studomat.repository.courseEnrollment;

import com.pmf.studomat.entities.CourseEnrollment;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseEnrollmentRowMapper implements RowMapper<CourseEnrollment> {

    @Override
    public CourseEnrollment mapRow(ResultSet rs, int rowNum) throws SQLException {

        CourseEnrollment courseEnrollment = new CourseEnrollment();

        courseEnrollment.setId(rs.getInt("id"));
        courseEnrollment.setStudentId(rs.getInt("student_id"));
        courseEnrollment.setCourseId(rs.getInt("course_id"));
        courseEnrollment.setGrade(rs.getInt("grade"));

        return courseEnrollment;
    }
}
