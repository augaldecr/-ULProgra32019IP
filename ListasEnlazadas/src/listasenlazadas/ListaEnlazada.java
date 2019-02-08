package listasenlazadas;

public class ListaEnlazada {
    
    private Nodo Inicio;
    private Nodo Fin;

    public ListaEnlazada() {
        this.Inicio = null;
        this.Fin = null;
    }

    public boolean vacia(){
        if(Inicio==null){
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(int n){
        Nodo temporal = new Nodo(n, null);
        if (vacia()) {
            Inicio = temporal;
            Fin = temporal;
        } else {
            Fin.setSiguiente(temporal);
            Fin = temporal;
        }
    }
}
