package Relacion_4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        int contador = 0;
        int i = 0;

        while (i < cadena.length()) {
            char letra = Character.toLowerCase(cadena.charAt(i));

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
            i++;
        }

        System.out.println("La cadena tiene " + contador + " vocales");

        sc.close();
    }
}
