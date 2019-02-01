import calculadora.Operaciones;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    
    @Test
    public void SumarTest(){
        Operaciones op = new Operaciones(5, 5);
        int resultadoEsperado = 10;
        assertEquals(op.sumar(), resultadoEsperado);
    }
    
    @Test
    public void RestarTest(){
        Operaciones op = new Operaciones(5, 5);
        int resultadoEsperado = 0;
        assertEquals(op.restar(), resultadoEsperado);
    }
    
    @Test
    public void MultiplicarTest(){
        Operaciones op = new Operaciones(5, 5);
        int resultadoEsperado = 25;
        assertEquals(op.multiplicar(), resultadoEsperado);
    }
    
    @Test
    public void DividirTest(){
        Operaciones op = new Operaciones(5, 5);
        int resultadoEsperado = 1;
        assertEquals(op.dividir(), resultadoEsperado);
    }
}
