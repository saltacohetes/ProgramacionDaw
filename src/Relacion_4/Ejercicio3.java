package Relacion_4;

//Invertir una cadena
//Solicita al usuario una cadena y utiliza un bucle para invertirla y mostrar el resultado.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = sc.nextLine();

        //Aqui almacenas el invertido gracias a la cadna vacia.
        String cadenaInvertida = "";

        //Deberias saber por que empeizas en menos 1 pero por si acaso es para empezar por el final de la cadena que inroduzcas
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        sc.close();
    }
}
