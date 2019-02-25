package javamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Connection conn;
    //private static final String driver ="com.mysql.cj.jdbc.Driver";
    private static final String usuario ="Vegetta777";
    private static final String contrasenna ="VivaWillyreh3";
    private static final String host ="jdbc:mysql://localhost:3309/?";
    private static final String db = "db_estudiantes";

    public Conexion() {
        conn = null;
        try {
            //Class.forName(driver);
            conn = DriverManager.getConnection("jdbc:mysql://(host=localhost,port=3309)/db_estudiantes?user=Vegetta777&password=VivaWillyreh3");
            if (conn != null) {
                System.out.println("Conexion establecida");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public Connection conectar(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        if (conn == null) {
            System.out.println("Desconexion exitosa");
        }
    }
}
