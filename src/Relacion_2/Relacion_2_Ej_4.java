package Relacion_2;

//La nota final de cada alumno se calcula según el siguiente criterio: la parte práctica
//vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%. Hacer un
//programa leerá el nombre de un alumno y sus tres notas y mostrará Nota final de [NOMBRE] es [NOTA FINAL]

import java.util.Scanner;

public class Relacion_2_Ej_4 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        double practica;
        double problemas = 0;
        double teoria = 0;
        String nombre;

        System.out.println("Introduce el nombre del alumno: ");
        nombre = sc.nextLine();
        System.out.println(nombre);

        System.out.println("Introduce el la nota de practica: ");
        practica = sc.nextDouble();

        System.out.println("Introduce el la nota de problemas: ");
        problemas = sc.nextDouble();

        System.out.println("Introduce el la nota de teroia ");
        teoria = sc.nextDouble();

        double notaFinal = (practica * 0.1) + (problemas * 0.5) + (teoria * 0.4) ;
        System.out.println("la nota final del alumno "+nombre+" es de: "+notaFinal);
        notaFinal = sc.nextDouble();

    }
}
