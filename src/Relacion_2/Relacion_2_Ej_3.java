package Relacion_2;

import java.util.Scanner;

//Elaborar un programa que permita ingresar el número de partidos ganados,
//perdidos y empatados, por algún equipo en el torneo de liga, se debe de mostrar su
//puntuación total, teniendo en cuenta que por cada partido ganado obtendrá 3
//puntos, empatado 1 punto y perdido 0 puntos
public class Relacion_2_Ej_3 {
    void main () {
        Scanner sc = new Scanner(System.in);

        String partido;
        String victoria;
        String derrota;
        String empate;
        int resultado = 0;
        int valor_victoria = 3;
        int valor_empate = 1;
        int valor_derrota = 0;

        System.out.println("Introduce el resultado del primer partido victoria/empate/derrota: ");
        partido = sc.nextLine();

        if (partido.equals("victoria")) {
            resultado += valor_victoria;
        } else if (partido.equals("empate")) {
            resultado += valor_empate;
        } else if (partido.equals("derrota")) {
            resultado += valor_derrota;
        } else
            System.out.println("Operador no valido"); {
        }


        System.out.println("Introduce el resultado del segundo partido victoria/empate/derrota: ");
        partido = sc.nextLine();

        if (partido.equals("victoria")) {
            resultado += valor_victoria;
        } else if (partido.equals("empate")) {
            resultado += valor_empate;
        } else if (partido.equals("derrota")) {
            resultado += valor_derrota;
        } else
            System.out.println("Operador no valido"); {
        }


        System.out.println("Introduce el resultado del tercer partido victoria/empate/derrota: ");
        partido = sc.nextLine();

        if (partido.equals("victoria")) {
            resultado += valor_victoria;
        } else if (partido.equals("empate")) {
            resultado += valor_empate;
        } else if (partido.equals("derrota")) {
            resultado += valor_derrota;
        } else
            System.out.println("Operador no valido"); {
        }

        System.out.println("Introduce el resultado del cuarto partido victoria/empate/derrota: ");
        partido = sc.nextLine();

        if (partido.equals("victoria")) {
            resultado += valor_victoria;
        } else if (partido.equals("empate")) {
            resultado += valor_empate;
        } else if (partido.equals("derrota")) {
            resultado += valor_derrota;
        } else
            System.out.println("Operador no valido"); {
        }


        System.out.println("EL resultado final es: "+resultado);
        sc.nextInt();
    }
}

