import java.util.ArrayList;

public class Pila {

    private ArrayList<String> miPila;

    public Pila() {
        this.miPila = new ArrayList<String>();
    }

    public void push(String value) {
        miPila.add(value);
    }

    public String pop() {
        if(isEmpty()) {
            return "La pila está vacia...";
        } else {
            String ultimoValor = miPila.getLast();
            miPila.removeLast();

            return ultimoValor;
        }
    }

    public String peek() {
        if(isEmpty()) {
            return "La pila está vacia...";
        } else {
            return miPila.getLast();
        }
    }

    public boolean isEmpty() {
        return miPila.isEmpty();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = miPila.size() - 1; i >= 0; i--) {
            sb.append(miPila.get(i));
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("] <- cima");
        return sb.toString();
    }
}
