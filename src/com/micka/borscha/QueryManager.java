package com.micka.borscha;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryManager {

    private JDBCConnection jdbcConnection;
    private Statement statement;
    private Connection connection;

    QueryManager(){
        jdbcConnection = new JDBCConnection();
        connection = jdbcConnection.getConnection();
    }

    public ResultSet doSolectStatement(String query){
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            return resultSet;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



}
