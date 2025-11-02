package Relacion_4;

//1. Contar caracteres en una cadena
//Escribe un programa que pida al usuario una cadena y cuente cuántos caracteres tiene
//usando un bucle. Muestra el resultado al finalizar.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un textto sin espacios: ");
        String cadena = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            contador++;
        }

        System.out.println("La cadena tiene " + contador + " caracteres.");

        sc.close();
    }
}
