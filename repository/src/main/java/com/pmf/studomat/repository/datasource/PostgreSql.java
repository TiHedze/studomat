package com.pmf.studomat.repository.datasource;


import com.pmf.studomat.repository.PostgreSqlPredmetDao;

import java.sql.*;

public class PostgreSql {
    private static PostgreSql instance = null;

    private static String URL = "jdbc:postgresql://localhost:5432/studomat";
    private static String DB_USER = "root";
    private static String DB_PASS = "root";

    private PostgreSql() {}

    public static PostgreSql getInstance() {
        if (PostgreSql.instance == null) {
            PostgreSql.instance = new PostgreSql();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(PostgreSql.URL, PostgreSql.DB_USER, PostgreSql.DB_PASS);
    }

    public PreparedStatement getPreparedStatement(String query) throws SQLException {
        Connection c = this.getConnection();
        return c.prepareStatement(query);
    }

    public ResultSet getQueryResults(String query) throws SQLException {
        Connection connection = instance.getConnection();
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(query);
    }
}
