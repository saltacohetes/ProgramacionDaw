package Relacion_2;

import java.util.Scanner;

public class Relacion_2_Ej_8 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        //No mires mas a sintaxis de esto aprendetelo de una vez copon que ya llevas bein de ejercicios
        System.out.print("Introduce el día de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Introduce el mes de nacimiento: ");
        int mes = sc.nextInt();

        System.out.print("Introduce el año de nacimiento: ");
        int anio = sc.nextInt();

        int suma = dia + mes + anio;

        //Aui estas parseando la suma a texto para coger cada char que necesitas sumar y que te de tu numero de la suerte
        String sumaTexto = Integer.toString(suma);

        int numeroSuerte = 0;
        if (sumaTexto.length() >= 1) numeroSuerte += Character.getNumericValue(sumaTexto.charAt(0));
        if (sumaTexto.length() >= 2) numeroSuerte += Character.getNumericValue(sumaTexto.charAt(1));
        if (sumaTexto.length() >= 3) numeroSuerte += Character.getNumericValue(sumaTexto.charAt(2));
        if (sumaTexto.length() >= 4) numeroSuerte += Character.getNumericValue(sumaTexto.charAt(3));
        if (sumaTexto.length() >= 5) numeroSuerte += Character.getNumericValue(sumaTexto.charAt(4)); // por si acaso

        System.out.println("Tu número de la suerte es: " + numeroSuerte);
    }
}
