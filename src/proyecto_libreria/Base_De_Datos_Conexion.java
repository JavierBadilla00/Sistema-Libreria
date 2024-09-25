/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 
 */
public class Base_De_Datos_Conexion {
    
    private static final String DATABASE_URL = "jdbc:ucanaccess://C:\\Users\\Javie\\Programacion_1_Biblioteca/Libreria_Proyecto_Programacion1.accdb";
 
    static {
        
        try {
            
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        } catch (ClassNotFoundException e) {    e.printStackTrace();
        }
    }
 
    public static Connection getConnection() throws SQLException {
        
        return DriverManager.getConnection(DATABASE_URL);
    }
    
}
