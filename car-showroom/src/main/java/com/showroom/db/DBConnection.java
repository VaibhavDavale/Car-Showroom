
package com.showroom.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/mydb";
        String user = "postgres";
        String password = "@vaibhav123";
        return DriverManager.getConnection(url, user, password);
    }
}
