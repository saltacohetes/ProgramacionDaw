package Relacion_3;

//Ejercicio 8: Algoritmo de números perfectos
//        Escribe un programa que determine si un número dado por el usuario es un
//        número perfecto. Un número perfecto es aquel que es igual a la suma de sus
//        divisores (excluyendo el propio número). Usa if-else y bucles para realizar la
//        verificación.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        int suma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma = suma + i;
            }
        }

        if (suma == n) {
            System.out.println(n + "Este es un numero perfecto.");
        } else {
            System.out.println(n + "Este no es un numero perfecto");
        }
    }
}