/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Estefania.Garces
 */
public class Coneccion {
   
    public static Connection getConnection(){
         // Definiendo conexión
        final String driver = "com.mysql.jdbc.Driver";
        final String user = "root";
        final String password = "";
        final String url = "jdbc:mysql://localhost/estudiantes";
        // Conexión
        Connection conn;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if(conn!= null){
                System.out.println("Conexión exitosa");
                return conn;
            }              
        }catch(Exception e){
            System.out.println("Error en la conexión; "+e.getMessage());
            return null;
        }
        return null;
    }
}
