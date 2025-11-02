package Relacion_4;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        String resultado = "";
        int i = 0;

        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);

            if (Character.isUpperCase(caracter)) {
                resultado += Character.toLowerCase(caracter);
            } else if (Character.isLowerCase(caracter)) {
                resultado += Character.toUpperCase(caracter);
            } else {
                resultado += caracter;
            }

            i++;
        }

        System.out.println("Cadena convertida: " + resultado);

        sc.close();
    }
}
