package pilasycolas;

import java.util.LinkedList;
import java.util.Stack;

public class PilasYColas {

    public static void main(String[] args) {
        System.out.println("Esta es la pila");
        pila();
        System.out.println("Esta es la cola");
        cola();
    }
    
    //FILO (First-In, Last-Out
    static void pila(){
        Stack pila = new Stack();
        pila.add(1);
        pila.add(2);
        pila.add(3);
        
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());            
        }
    }
    
    //FIFO (First-In, First-Out
    static void cola(){
        LinkedList cola = new LinkedList();
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        
        while (cola.peek() != null) {
            System.out.println(cola.poll());
        }
    }
    
}
