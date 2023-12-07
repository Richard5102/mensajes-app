package com.messages.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection() throws SQLException {
        Connection conneciton = null;
        String url = "jdbc:mysql://localhost:3306/project";
        String user = "root";
        String pass = "5102";


            conneciton = DriverManager.getConnection(url, user, pass);
        if (conneciton != null)
            System.out.println("Conexion exitosa");
        return conneciton;
    }
}
