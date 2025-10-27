package Relacion_3;

import java.util.Scanner;

public class Ejercicio9 {
        static void main() {
            Scanner sc = new Scanner(System.in);

            //Introducción
            System.out.print("Introduce un operador char (+,-,*,/,^,r,!): ");
            char operador = sc.next().charAt(0);

            double resultado = 0;

            if (operador=='+' || operador=='-' || operador=='*' || operador=='/' || operador=='^') {

                System.out.print("Introduce un número: ");
                int numero1 = sc.nextInt();
                System.out.print("Introduce otro número: ");
                int numero2 = sc.nextInt();

                //Nudo
                switch (operador) {
                    case '+': resultado = numero1 + numero2; break;
                    case '-': resultado = numero1 - numero2; break;
                    case '*': resultado = numero1 * numero2; break;
                    case '/':
                        if (numero2 == 0) { System.out.println("Error, no puedes dividir por 0"); return; }
                        resultado = (double) numero1 / numero2;
                        break;
                    case '^':
                        if (numero2 < 0) { System.out.println("Error, el exponenete es negativo"); return; }
                        resultado = Math.pow(numero1, numero2);
                        break;
                }

            } else if (operador=='r') {
                System.out.print("Introduce un número: ");
                int numero = sc.nextInt();
                if (numero < 0) { System.out.println("Error, la raiz es negativa"); return; }
                resultado = Math.sqrt(numero);

            } else if (operador=='!') {
                System.out.print("Introduce un número: ");
                int numero = sc.nextInt();
                if (numero < 0) { System.out.println("Error, el factorial es negativo"); return; }
                long fact = 1;
                for(int i=1;i<=numero;i++) fact *= i;
                resultado = fact;
            } else {
                System.out.println("Operador invalido");
                return;
            }
            //Desenlace
            System.out.println("El resultado es: " + resultado);
        }
}
