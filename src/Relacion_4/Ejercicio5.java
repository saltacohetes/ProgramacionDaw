package Relacion_4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = sc.nextLine();

        int inicio = 0;
        int fin = palabra.length() - 1;
        boolean esPalindromo = true;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                esPalindromo = false;
                break;
            }
            inicio++;
            fin--;
        }

        if (esPalindromo) {
            System.out.println("'" + palabra + "' ES un palíndromo");
        } else {
            System.out.println("'" + palabra + "' NO es un palíndromo");
        }

        sc.close();
    }
}
