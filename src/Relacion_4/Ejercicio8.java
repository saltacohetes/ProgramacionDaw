package Relacion_4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generar número aleatorio entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int intentos = 0;

        System.out.println("¡Adivina el número entre 1 y 100!");

        while (true) {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Adivinaste en " + intentos + " intentos.");
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("Más alto");
            } else {
                System.out.println("Más bajo");
            }
        }

        sc.close();
    }
}
