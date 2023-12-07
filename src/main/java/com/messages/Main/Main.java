package com.messages.Main;

import com.messages.Util.Conexion;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Conexion connect = new Conexion();
        connect.get_connection();
    }

}
