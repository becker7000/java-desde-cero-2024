package net.tecgurus.webapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Usando el patrón singleton
public class ConexionBD {

    private static String url = "jdbc:mysql://localhost:3306/tecgurus_tienda?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "toor";
    private static Connection connection;

    public static Connection getIntance(){
        if(connection==null){
            try{
                connection = DriverManager.getConnection(url,username,password);
            }catch (SQLException exception){
                System.out.println("\n\t Error al conectar la base de datos...");
            }
        }
        return connection;
    }

}
