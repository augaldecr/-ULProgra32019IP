package listasenlazadas;

public class Nodo {
    
    private int Dato;
    private Nodo Siguiente;

    public Nodo(int Dato, Nodo Siguiente) {
        this.Dato = Dato;
        this.Siguiente = Siguiente;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }
}
