package Relacion_4;

import java.util.Random;

public class Ejercicio19 {
    public static void main() {
        Random random = new Random();

        int suma = 0;
        int i = 0;

        System.out.println("10 números aleatorios entre 1 y 100:");

        while (i < 10) {
            int numero = random.nextInt(100) + 1;
            System.out.print(numero + " ");
            suma += numero;
            i++;
        }

        double media = suma / 10.0;

        System.out.println("Suma total: " +suma);
        System.out.println("Media: " +media);
    }
}
