package listasenlazadas;

public class NodoPersona {
    
    private NodoPersona siguiente;
    private Persona dato;

    public NodoPersona(NodoPersona siguiente, Persona dato) {
        this.siguiente = siguiente;
        this.dato = dato;
    }

    public NodoPersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersona siguiente) {
        this.siguiente = siguiente;
    }

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }
}
