package calculadora;

import java.io.IOException;

public class Calculadora {
    
    public static void main(String[] args) throws IOException {
        
        Operaciones calcu = new Operaciones(3,4);
        
        System.out.println(String.format("Suma: %d",calcu.sumar()));
        System.out.println(String.format("Resta: %d",calcu.restar()));
        System.out.println(String.format("Multiplicacion: %d",calcu.multiplicar()));
        System.out.println(String.format("Division: %d",calcu.dividir()));
        // Ola k ase?
        System.in.read();
    }
    
}
