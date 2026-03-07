import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Se definen las pilas y otras variables
        Pila undoStack = new Pila();
        Pila redoStack = new Pila();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        String opcionElegida;
        String textoCompleto = "";

        // Menú en consola

        do {
            System.out.println("Por favor seleccione una de las siguientes opciones: ");
            System.out.println("Escribir texto - 1");
            System.out.println("Deshacer - 2");
            System.out.println("Rehacer - 3");
            System.out.println("Mostrar texto actual - 4");
            System.out.println("Salir - 5");
            System.out.print("--> ");
            opcionElegida = scanner.next();

            switch (opcionElegida) {
                case "1":
                    scanner.nextLine();
                    System.out.println("Ingresa el texto: ");
                    textoCompleto += scanner.nextLine();
                    undoStack.push(textoCompleto);
                    redoStack = new Pila();
                    break;
                case "2":
                    if(undoStack.isEmpty()) {
                        System.out.println("Pila vacia, intenta otra opcion");
                    } else {
                        redoStack.push(undoStack.pop());
                        textoCompleto = undoStack.isEmpty() ? "" : undoStack.peek();
                    }
                    break;
                case "3":
                    if(redoStack.isEmpty()) {
                        System.out.println("Pila vacia, intenta otra opcion");
                    } else {
                        textoCompleto = redoStack.pop();
                        undoStack.push(textoCompleto);
                    }
                    break;
                case "4":
                    System.out.println(undoStack.peek());
                    break;
                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("No existe esa opción, por favor intenta nuevamente.");
                    break;
            }
        } while(!salir);


    }
}
