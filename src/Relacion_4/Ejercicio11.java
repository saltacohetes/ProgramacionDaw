package Relacion_4;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        int contadorPalabras = 0;
        boolean enPalabra = false;
        int i = 0;

        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);

            if (caracter != ' ') {
                if (!enPalabra) {
                    contadorPalabras++;
                    enPalabra = true;
                }
            } else {
                enPalabra = false;
            }

            i++;
        }

        System.out.println("Número de palabras: " + contadorPalabras);

        sc.close();
    }
}
