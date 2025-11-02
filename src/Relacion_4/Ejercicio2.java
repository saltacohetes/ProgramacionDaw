package Relacion_4;

//Buscar una letra en una cadena
//        Pide al usuario una cadena y una letra. Utiliza un bucle para contar cuántas veces aparece la
//        letra en la cadena y muestra el resultado.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        System.out.print("Ingresa la letra que quieres buscar: ");
        char letra = sc.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");

        sc.close();
    }
}
