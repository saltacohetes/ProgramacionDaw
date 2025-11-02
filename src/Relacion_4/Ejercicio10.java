package Relacion_4;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        String cadenaMasLarga = "";
        String cadena = "";

        System.out.println("Ingresa cadenas (escribe 'salir' para terminar):");

        cadena = sc.nextLine();

        while (!cadena.equalsIgnoreCase("salir")) {
            contador++;

            if (cadena.length() > cadenaMasLarga.length()) {
                cadenaMasLarga = cadena;
            }

            cadena = sc.nextLine();
        }

        System.out.println("Total de cadenas ingresadas: " + contador);
        if (contador > 0) {
            System.out.println("Cadena más larga: '" + cadenaMasLarga + "' (" + cadenaMasLarga.length() + " caracteres)");
        } else {
            System.out.println("No se ingresaron cadenas.");
        }

        sc.close();
    }
}
