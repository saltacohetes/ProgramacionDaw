package Relacion_3;

//Ejercicio 10: Sistema de gestión de calificaciones con promedio ponderado
//        Crea un programa que permita al usuario introducir las calificaciones de 6
//        materias, junto con el peso porcentual de cada una. Calcula el promedio
//        ponderado usando `if-else` para verificar que la suma de los pesos sea 100%.
//        Si no es así, muestra un mensaje de error. Además, si el promedio es menor a
//        60%, mostrar un mensaje indicando que el usuario ha reprobado

import java.util.Scanner;

public class Ejercicio10 {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        String nombre;
        double nota;
        double peso;
        double sumaPesos = 0;
        double acumulado = 0;

        System.out.println("Introduce el nombre, la nota y el peso (%) de 6 materias:");

        for (int i = 1; i <= 6; i++) {
            System.out.print("\nNombre de la materia " + i + ": ");
            nombre = sc.next();

            System.out.print("Nota de " + nombre + ": ");
            nota = sc.nextDouble();

            System.out.print("Peso de " + nombre + " (en %): ");
            peso = sc.nextDouble();

            sumaPesos += peso;
            acumulado += nota * peso;
            }

            if (sumaPesos != 100) {
                System.out.println("\nERROR: La suma de los pesos debe ser exactamente 100%");
                return;
            }

            double promedioPonderado = acumulado / 100;
            System.out.println("\nPromedio ponderado = " + promedioPonderado);

            if (promedioPonderado < 60) {
                System.out.println("Has reprobado.");
            } else {
                System.out.println("Has aprobado.");
            }
    }
}
