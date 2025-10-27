package Relacion_3;

//Ejercicio 6: Calculadora de impuestos según ingresos
//        Escribe un programa que calcule los impuestos de una persona en función de
//        sus ingresos anuales. Usa `if-else` para determinar los tramos:
//        - Menos de 20.000: 5%
//        - Entre 20.000 y 40.000: 10%
//        - Entre 40.000 y 80.000: 20%
//        - Más de 80.000: 30%
//        Además, si el usuario tiene más de 3 dependientes, reducir el impuesto en un
//        5%.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        double descuento = 0.0;

        System.out.println("Introduzca sus ingresos anuales: ");
        double ingresos = sc.nextInt();

        System.out.println("Ingrese su numero de dependientes: ");
        int dependientes = sc.nextInt();
        sc.nextLine();

        if (ingresos < 20000){
            descuento = 0.05;
            if (dependientes > 3) {
                descuento = 0.1;
            }
        }
        else if (ingresos >= 20000 && ingresos <= 39999){
            descuento = 0.1;
            if (dependientes > 3) {
                descuento = 0.15;
            }
        }
        else if (ingresos >= 40000 && ingresos <= 79999){
            descuento = 0.2;
            if (dependientes > 3) {
                descuento = 0.25;
            }
        }
        else if (ingresos > 80000){
            descuento = 0.3;
            if (dependientes > 3) {
                descuento = 0.35;
            }
        }
        double resultado = ingresos - (ingresos * descuento);
        System.out.println("Su total a pagar es de: "+resultado);
    }
}
