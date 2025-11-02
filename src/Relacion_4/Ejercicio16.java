package Relacion_4;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        int suma = 0;
        int temp = Math.abs(numero);

        while (temp > 0) {
            // Consigo el ultimo digito
            suma += temp % 10;
            // Elimino el ultimo digito
            temp = temp / 10;
        }

        System.out.println("La suma de los dígitos de " + numero + " es: " +suma);

        sc.close();
    }
}

