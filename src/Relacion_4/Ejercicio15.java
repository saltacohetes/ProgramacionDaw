package Relacion_4;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        int contador = 0;
        // Usas esto de math abs para qu siempre me de vaor absoluto y asi lidiar con numeros negativos
        int temp = Math.abs(numero);

        // Esto es solo por el 0
        if (temp == 0) {
            contador = 1;
        } else {
            while (temp > 0) {
                contador++;
                temp = temp / 10;
            }
        }

        System.out.println("El número " + numero + " tiene " + contador + " dígitos");

        scanner.close();
    }
}
