package Relacion_2;

//Queremos evaluar un polinomio de coeficientes enteros, para un valor de la
//incógnita que se solicite al usuario y se introduzca desde teclado. El polinomio en
//cuestión es el siguiente (no podéis usar Math.pow()):

import java.util.Scanner;

public class Relacion_2_Ej_5 {
    static void main() {
        int incognita;
        int resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la incognita: ");
        incognita = sc.nextInt();

        resultado = (7 * 7 * 7 * 7 * incognita) - (4 * 4 * 4 * incognita) + (2 * 2 * incognita) - incognita + 10;
        System.out.println("El resultado es: "+resultado);
    }
}
