package web.loja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBanco {

    public static Connection getConnection() throws SQLException {
        String dbUri = "localhost";
        String dbPort = "5432";
        String dbName = "postgres";

        String username = "postgres";
        String password = "root";
        String dbUrl = "jdbc:postgresql://" + dbUri + ":" + dbPort + "/" + dbName;

        return DriverManager.getConnection(dbUrl, username, password);
    }
}
