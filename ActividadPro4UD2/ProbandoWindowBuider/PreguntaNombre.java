package ProbandoWindowBuider;
import java.util.Scanner;
public class PreguntaNombre {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("¡Hola, " + nombre + "!");
        }
    }
}

