package Relacion_4;

//Generar una cadena aleatoria
//        Crea un programa que genere una cadena de longitud `n` con caracteres aleatorios
//        utilizando la clase Random. Pide `n` al usuario.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa la longitud de la cadena que será aleatoria: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("La longitud debe ser un número positivo.");
        } else {
            StringBuilder cadenaAleatoria = new StringBuilder();

            for (int i = 0; i < n; i++) {
                char caracter = (char) (random.nextInt(26) + 'a');
                cadenaAleatoria.append(caracter);
            }

            System.out.println("Cadena aleatoria: " + cadenaAleatoria.toString());
        }

        sc.close();
    }
}
