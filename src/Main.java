import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Se definen las pilas y otras variables
        Pila pilaPrincipal = new Pila();
        Pila pilaSecundaria = new Pila();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        String opcionElegida = "";

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
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("No existe esa opción, por favor intenta nuevamente.");
                    break;
            }
        } while(!salir);


    }
}
