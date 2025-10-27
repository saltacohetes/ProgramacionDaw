package Relacion_3;
//Ejercicio 4:
//Validación de una fecha
//Escribe un programa que solicite al usuario una fecha (día, mes, año) y valide
//si la fecha es correcta.
// Considera los años bisiestos y los meses que tienen diferentes números de días.
//Usa `switch` para verificar los meses, y `if-else`para los años bisiestos

import java.util.Scanner;

public class Ejercicio4 {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        int dia;
        int mes;
        int anio;

        System.out.print("Ingresa día: ");
        dia = sc.nextInt();

        System.out.print("Ingresa mes: ");
        mes = sc.nextInt();

        System.out.print("Ingresa año: ");
        anio = sc.nextInt();

        boolean esBisiesto;
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }

        int diasEnMes;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> diasEnMes = 31;
            case 4, 6, 9, 11 -> diasEnMes = 30;
            //preguntado al gepeto. Recuerda que la condicon seguida de la interrogacion es un qué valor tomar si la condición es verdadera. (condición ? valorSiVerdadero : valorSiFalso)
            case 2 -> diasEnMes = esBisiesto ? 29 : 28;
            default -> diasEnMes = -1;
        }

        if (diasEnMes == -1) {
            System.out.println("Fecha inválida: mes no válido.");
        } else if (dia >= 1 && dia <= diasEnMes) {
            System.out.println("Fecha válida.");
        } else {
            System.out.println("Fecha inválida: día no válido.");
        }
    }
}
