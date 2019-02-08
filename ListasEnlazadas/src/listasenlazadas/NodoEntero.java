package listasenlazadas;

public class NodoEntero {
    
    private int Dato;
    private NodoEntero SiguienteNodo;

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public NodoEntero getSiguienteNodo() {
        return SiguienteNodo;
    }

    public void setSiguienteNodo(NodoEntero SiguienteNodo) {
        this.SiguienteNodo = SiguienteNodo;
    }
}
