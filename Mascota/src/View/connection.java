/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Estefania.Garces
 */
public class connection {
    
    public static Connection getConexion(){
        // DATOS QUE PIDEN PARA LA CONEXIÓN
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost/mascota";
     
        // INICIANDO PROCESO DE CONEXIÓN
        Connection connection;
        try{
            Class.forName(driver);
            connection = (Connection) DriverManager.getConnection(url, user, password);
            if(connection != null){
                System.out.println("Conexión exitosa.");
                return connection;
            }
        }catch(Exception e){
            System.out.println("Error en la conexión: "+e.getMessage());
            return null;
        }
        
        return null;
    }  
}
