package Relacion_2;

import java.util.Scanner;

//Escribe un programa que calcule el salario semanal de un empleado en base a las
//horas trabajadas al día, a razón de 12 euros la hora.
public class Relacion_2_Ej_2 {
    void main () {
        int horas;
        int horastrabajadas;


        Scanner sc = new Scanner(System.in);
        //Si quieres inciar la variable en consola recuerda poner el variable = sc.nextLOqueNecesitesInt()
        System.out.println("Introduce las horas trabajadas: ");
        horas = sc.nextInt();

        horastrabajadas = horas * 12;
        System.out.println("El salario semanal de este empleado es:  "+horastrabajadas);
    }
}