package listasenlazadas;

import javax.swing.JOptionPane;

public class Lista {
    
    private NodoPersona inicio;
    private NodoPersona fin;

    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean estaVacia(){
        if (inicio==null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(Persona persona){
        NodoPersona actual;
        if (estaVacia()) {
            actual= new NodoPersona(null, persona);
            inicio = actual;
            fin =actual;
        } else {
            actual = new NodoPersona(null, persona);
            fin.setSiguiente(actual);
            fin = actual;
        }
    }
    
    public void mostrar(){
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
            return;
        } else {
            NodoPersona temporal;
            temporal = inicio;
            while (temporal!=null) {
                JOptionPane.showMessageDialog(null, temporal.getDato().toString());
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void buscar(String ced){
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "Lista vacía");
            return;
        } else {
            NodoPersona temporal;
            temporal = inicio;
            while (temporal!=null) {
                if (ced == temporal.getDato().getApellido()) {
                    JOptionPane.showMessageDialog(null, temporal.getDato().toString());
                    break;
                }

            }
        }
    }
    
    public void eliminar(){
        
    }
}
