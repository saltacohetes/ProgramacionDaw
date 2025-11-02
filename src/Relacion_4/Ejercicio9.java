package Relacion_4;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = sc.nextInt();

        int suma = 0;
        int i = 2;  // Empezamos en 2, el primer número par

        while (i <= N) {
            suma += i;
            i += 2;  // Saltamos de 2 en 2 para solo números pares
        }

        System.out.println("La suma de los números pares desde 1 hasta " + N + " es: " + suma);

        sc.close();
    }
}
