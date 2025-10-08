package Relacion_2;

//Escribe un programa que recibe dos instantes de tiempo en horas, minutos y
//segundos. El programa nos mostrará la diferencia entre esos dos instantes de
//tiempo en horas, minutos y segundos. Suponemos que el primer tiempo introducido
//es anterior al segundo

import java.util.Scanner;

public class Relacion_2_Ej_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        //Recuerda que puedes declarar la variables directamente en el scanner que casi no lo haces nunca pero lo puedes hacer

        System.out.print("Introduce la primera hora: ");
        int h1 = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int m1 = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int s1 = sc.nextInt();

        System.out.print("Introduce la segunda hora: ");
        int h2 = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int m2 = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int s2 = sc.nextInt();

        int t1 = h1 * 3600 + m1 * 60 + s1;
        int t2 = h2 * 3600 + m2 * 60 + s2;

        int diferencia = t2 - t1;

        int horas = diferencia / 3600;
        diferencia %= 3600;
        int minutos = diferencia / 60;
        int segundos = diferencia % 60;

        System.out.println("La diferencia es de " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");


    }
}