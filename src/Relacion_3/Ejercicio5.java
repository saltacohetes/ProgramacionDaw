package Relacion_3;

//Ejercicio 5: Sistema de clasificación de triángulos
//Solicita al usuario las longitudes de los tres lados de un triángulo.
//Usa una serie de if-else y operadores lógicos para determinar el tipo de triángulo:
//        - Equilátero: Los tres lados son iguales.
//        - Isósceles: Dos lados son iguales.
//        - Escaleno: Todos los lados son diferentes.
//        - Invalido: No forman un triángulo.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer lado: ");
        int lado1 = sc.nextInt();
        System.out.println("Introduce el segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.println("Introduce el tercer lado: ");
        int lado3 = sc.nextInt();


        if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2 ){
            System.out.println("Este triangulo es invalido");
        }
        else if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
            System.out.println("Este triangulo es equilatero");
        }
        //Recuewrda ue el altgr y 1 te dan el || qye es una (O) en vez del && (Y)
        //Aqui te estas haciendo als comprobaciones de dos en dos con el ||
        else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
            System.out.println("Este triangulo es isosceles");
        }
        else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            System.out.println("Este triangulo es escaleno");
        }
    }
}
