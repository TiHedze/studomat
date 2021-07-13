package com.pmf.studomat.repository.collegeEnrollment;

import com.pmf.studomat.entities.CollegeEnrollment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CollegeEnrollmentRowMapper implements RowMapper<CollegeEnrollment> {
    @Override
    public CollegeEnrollment mapRow(ResultSet rs, int rowNum) throws SQLException {
        CollegeEnrollment collegeEnrollment = new CollegeEnrollment();

        collegeEnrollment.setId(rs.getInt("id"));
        collegeEnrollment.setCollegeId(rs.getInt("college_id"));
        collegeEnrollment.setStudentId(rs.getInt("student_id"));
        collegeEnrollment.setYear(rs.getInt("year"));

        return collegeEnrollment;
    }
}
