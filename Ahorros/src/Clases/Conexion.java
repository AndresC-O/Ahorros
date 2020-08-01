package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private static Connection conn;
    private static final String User = "root";
    private static final String Password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/ahorrosbd";
    
    public Conexion(){
        conn = null;
        try{
            conn = (Connection) DriverManager.getConnection(url, User, Password);
            
            if(conn != null){
                System.out.println("¡Conexión Establecida!");
            }
        }
        catch(Exception ex){
            System.out.println("¡Error al Conectar a la Base de Datos! " + ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void Desconectar(){
        conn = null;
        
        if(conn == null){
            System.out.println("¡Deconectado con éxito!");
        }
    }
}
