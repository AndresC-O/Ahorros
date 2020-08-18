package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    //PARA ACCEDER A LOCALHOST
    private static Connection conn;
    private static final String User = "root";
    private static final String Password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/ahorrosbd";
    //PARA ACCEDER A WEB SERVER
//    private static Connection conn;
//    private static final String User = "sql9358524";
//    private static final String Password = "aEpPtPGZJi";
//    private static final String url = "jdbc:mysql://sql9.freemysqlhosting.net/sql9358524";
    //PARA ACCEDER A FREEHOSTING
//    private static Connection conn;
//    private static final String User = "epiz_26532749";
//    private static final String Password = "GwvlIfBJQa";
//    private static final String url = "jdbc:mysql://sql313.epizy.com/epiz_26532749_ahorrosbd";
    //PARA ACCEDER A IP SERVER
//    private static Connection conn;
//    private static final String User = "root";
//    private static final String Password = "root";
//    private static final String url = "jdbc:mysql://192.168.1.10:3306/ahorrosbd";
    
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
