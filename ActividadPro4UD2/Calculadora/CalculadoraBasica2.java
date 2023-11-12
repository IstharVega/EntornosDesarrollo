package Calculadora;

import java.util.Scanner;

public class CalculadoraBasica2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        String operacion;

        System.out.println("Ingrese la operación (Suma, Resta, Multiplicacion, Division): ");
        operacion = scanner.nextLine();
        System.out.println("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        switch (operacion) {
            case "Suma":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "Resta":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "Multiplicacion":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "Division":
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                }
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

        scanner.close();
    }
}