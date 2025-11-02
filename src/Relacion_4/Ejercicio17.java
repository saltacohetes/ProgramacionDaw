package Relacion_4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        int intento;
        int intentos = 0;

        System.out.println("¡Adivina el número entre 1 y 10!");

        do {
            System.out.print("Tu intento: ");
            intento = sc.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Más alto");
            } else if (intento > numeroSecreto) {
                System.out.println("Más bajo");
            }

        } while (intento != numeroSecreto);

        System.out.println("¡Correcto! El número era " +numeroSecreto);
        System.out.println("Lo adivinaste en " + intentos + " intentos");

        sc.close();
    }
}
