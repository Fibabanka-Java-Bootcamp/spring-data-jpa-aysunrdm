package com.aysunerdem.Jdbc;

import java.sql.*;

public class JdbcStatement {

    public static void main(String[] args) throws SQLException {


        try (Connection connection= DriverManager.getConnection("jdbc:h2:mem:h2database","admin","admin")){

        try(Statement statement= connection.createStatement()){

            String ddlSql = "CREATE TABLE IF NOT EXISTS users"
                    + "(id int PRIMARY KEY AUTO_INCREMENT, name varchar(30),";

            statement.execute(ddlSql);

            String insertSql = "INSERT INTO users(name, id)"
                    + "VALUES('Linda', '004')";


            if(statement.executeUpdate(insertSql)==1){
                String selectSql = "SELECT * FROM users";

                ResultSet resultSet= statement.executeQuery(selectSql);

                while (resultSet.next()){
                    String users = "Id: " + resultSet.getInt(1)
                            + "name: "  + resultSet.getString(2);
                }
            }

        }

    }}}