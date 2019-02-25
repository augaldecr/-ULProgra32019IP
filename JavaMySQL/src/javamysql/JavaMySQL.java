package javamysql;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class JavaMySQL {

    public static void main(String[] args) {
        
        Conexion conn;
        conn = new Conexion();

        Connection con = conn.conectar();
        
        String seleccion = JOptionPane.showInputDialog("Seleccione la opción a ejecutar \n 1-Ingresar \n 2-Consultar tabla");
        
        if (seleccion=="1") {
            String cedula = JOptionPane.showInputDialog("Ingrese la cédula");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
            String apellido1 = JOptionPane.showInputDialog("Ingrese el primer apellido");
            String apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido");
            String email = JOptionPane.showInputDialog("Ingrese el email");
            //Implementa insercion
        } else if (seleccion == "2") {
            FrmConsulta consulta = new FrmConsulta();
            consulta.setVisible(true);
        }
        

    }
}
