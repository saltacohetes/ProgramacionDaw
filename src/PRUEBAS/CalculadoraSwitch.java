package PRUEBAS;

import java.util.Scanner;

public class CalculadoraSwitch {
    static void main() {
        //Introduccion
        int numero1;
        int numero2;
        double resultado;
        char operador2;
        Scanner sc = new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce un numero: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        numero2 = sc.nextInt();
        System.out.println("Introduce un operador char (+,-,*,/): ");
        operador2 = sc.next().charAt(0);

        switch (operador2){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            default:
                resultado=-1.0;
                break;
        }

        //Desenlace
        System.out.println("El resultado es: " + resultado);
    }
}
