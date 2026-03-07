import java.util.ArrayList;

public class Pila {

    private ArrayList<Integer> miPila;

    public Pila() {
        this.miPila = new ArrayList<Integer>();
    }

    public void push(int value) {
        miPila.add(value);
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("La pila está vacia...");
            return -1;
        } else {
            int ultimoValor = miPila.getLast();
            miPila.removeLast();

            return ultimoValor;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("No hay valores en la pila...");
            return -1;
        } else {
            return miPila.getLast();
        }
    }

    public boolean isEmpty() {
        return miPila.isEmpty();
    }
}
