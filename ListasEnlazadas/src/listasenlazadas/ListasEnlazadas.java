package listasenlazadas;

import javax.swing.JOptionPane;

public class ListasEnlazadas {

    public static void main(String[] args) {
        Lista l = new Lista();
        int seleccion = 0;
        do {
            String opcion = JOptionPane.showInputDialog(null, "Lista simple\n 1-Insertar \n 2-Mostrar \n 3-Buscar \n 4-Eliminar \n 6-Salir");
            seleccion = Integer.parseInt(opcion);
            
            if (seleccion==1) {
                String cedula, nombre, apellido;
                cedula = JOptionPane.showInputDialog(null, "Ingrese la cédula");
                nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido");
                l.insertar(new Persona(0,cedula, nombre, apellido));
            } else if(seleccion==2){
                l.mostrar();
            } else if(seleccion==3){
                String ced = JOptionPane.showInputDialog(null, "Ingrese la cédula a consultar");
                l.buscar(ced);
            } else if(seleccion==4){
                String ced = JOptionPane.showInputDialog(null, "Ingrese la cédula a eliminar");
                l.eliminar(ced);
            }
        } while (seleccion!=6);        
    }
}
