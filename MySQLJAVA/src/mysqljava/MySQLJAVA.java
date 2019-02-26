package mysqljava;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class MySQLJAVA {

    public static void main(String[] args) {
        Conexion conn;
        conn = new Conexion();
        
        Connection conexion = conn.Conectar();
        
        String seleccion = JOptionPane.showInputDialog("Seleccione la opción a ejecutar \n 1-Ingresar"
                + "\n 2-Mostrar");
        if (seleccion == "1") {
            String cedula = JOptionPane.showInputDialog("Ingrese la cédula");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
            String apellido1 = JOptionPane.showInputDialog("Ingrese el primer apellido");
            String apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido");
            String email = JOptionPane.showInputDialog("Ingrese el email");
            //Implementar insert
        } else if (seleccion == "2") {
            System.out.println("mysqljava.MySQLJAVA.main()");
        }
                
    }
    
}
