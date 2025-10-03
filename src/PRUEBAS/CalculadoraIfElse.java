package PRUEBAS;

import java.util.Scanner;

public class CalculadoraIfElse {
    static void main() {
        //Introduccion
        int numero1;
        int numero2;
        double resultado;
        String operador;
        char operador2;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce un numero: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        numero2 = sc.nextInt();
        System.out.println("Introduce un operador string (+,-,*,/): ");
        sc.nextLine();
        operador = sc.nextLine();
        System.out.println("Introduce un operador char (+,-,*,/): ");
        operador2 = sc.nextLine().charAt(0);

        if (operador.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operador.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operador.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operador.equals("/")) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Operador no valido");
            resultado=-1;
        }

        //Desenlace
        System.out.println("El resultado es: " + resultado);


    }
}
