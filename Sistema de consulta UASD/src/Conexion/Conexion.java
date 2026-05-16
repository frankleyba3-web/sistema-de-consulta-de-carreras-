package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection con;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/uasd",
                "root",
                ""
            );

            System.out.println("Conectado a la base de datos");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return con;
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}