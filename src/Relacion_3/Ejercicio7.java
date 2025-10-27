package Relacion_3;

//Ejercicio 7: Juego de piedra, papel, tijera, lagarto, Spock
//        Crea un programa que permita a dos usuarios jugar a "Piedra, papel, tijera, lagarto, Spock".
//        Usa switch para determinar el ganador según las siguientes reglas:
//        - Tijeras cortan papel.
//        - Papel cubre piedra.
//        - Piedra aplasta lagarto.
//        - Lagarto envenena Spock.
//        - Spock rompe tijeras.
//        - Tijeras decapitan lagarto.
//        - Lagarto come papel.
//        - Papel desautoriza a Spock.
//        - Spock vaporiza piedra.
//        - Piedra aplasta tijeras

import java.util.Scanner;

public class Ejercicio7 {
    public static void main() {
    Scanner sc = new Scanner(System.in);

        System.out.println("1 = Piedra");
        System.out.println("2 = Papel");
        System.out.println("3 = Tijera");
        System.out.println("4 = Lagarto");
        System.out.println("5 = Spock");

        System.out.print("Jugador 1, elige opción (1-5): ");
        int j1 = sc.nextInt();

        System.out.print("Jugador 2, elige opción (1-5): ");
        int j2 = sc.nextInt();

        if (j1 == j2) {
        System.out.println("Empate!");
        }

        else {
            boolean ganaJ1 = false;

        switch (j1) {
            case 1:
                if (j2 == 3 || j2 == 4) {
                ganaJ1 = true;
                }
                break;
            case 2: // papel
                if (j2 == 1 || j2 == 5) {
                ganaJ1 = true;
                }
                break;
            case 3:
                if (j2 == 2 || j2 == 4) {
                ganaJ1 = true;
                }
                break;
            case 4:
                if (j2 == 5 || j2 == 2) {
                ganaJ1 = true;
                }
                break;
            case 5:
                if (j2 == 3 || j2 == 1) {
                ganaJ1 = true;
                }
                break;
        }

        if (ganaJ1) {
        System.out.println("Gana Jugador 1");
        } else {
        System.out.println("Gana Jugador 2");
        }
    }
}
}
