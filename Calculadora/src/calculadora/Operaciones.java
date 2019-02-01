package calculadora;

public class Operaciones {
    
    private int Num1;
    private int Num2;

    public Operaciones(int Num1, int Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }
    
    public int getNum2() {
        return Num2;
    }

    public void setNum2(int Num2) {
        this.Num2 = Num2;
    }
    
    public int getNum1() {
        return Num1;
    }

    public void setNum1(int Num1) {
        this.Num1 = Num1;
    }

    public int sumar(){
        return this.Num1+this.Num2;
    }
    
    public int restar(){
        return this.Num1-this.Num2;
    }
    
    public int multiplicar(){
        return this.Num1*this.Num2;
    }
    
    public int dividir(){
        return this.Num1/this.Num2;
    }
}
