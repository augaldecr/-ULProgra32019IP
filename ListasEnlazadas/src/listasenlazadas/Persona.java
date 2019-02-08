package listasenlazadas;

public class Persona {
    
    private int ID;
    private String Cedula;
    private String Nombre;
    private String Apellido;

    public Persona() {
    }
    
    public Persona(int ID, String Cedula, String Nombre, String Apellido) {
        this.ID = ID;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }    

    @Override
    public String toString() {
        return String.format("\n Cédula: %s, Nombre: %s, Apellido: %s", this.Cedula, this.Nombre, this.Apellido);
    }
}
