package Ejercicio3CSV;

import java.util.Scanner;

public class Ejecutadora {
    static void main() {
        String ruta1 = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio3CSV/datos.csv";
        String ruta2 = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio3CSV/jesus.csv";
        String[] cabecera1 = {"nombre","edad","cuidad"};
        String cabecera2 = "nombre,edad,cuidad";
        AgregarCSV.escribirCabecera(ruta1,cabecera1);
        AgregarCSV.escribirFilaSinArray(ruta2,cabecera2);

        String opcion = null;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el nombre");
            String nombre = sc.nextLine();
            System.out.println("Dime la edad");
            String edad = sc.nextLine();
            System.out.println("Dime la cuidad");
            String cuidad = sc.nextLine();
            System.out.println("Quieres seguir ? S/N ");
            opcion = sc.nextLine();

            //OPcion 1
            String[] datos1 = {nombre,edad,cuidad};
            AgregarCSV.escribirFila(ruta1,datos1);

            //Opcion 2
            String datos2 = nombre + "," + edad + "," + cuidad;
            AgregarCSV.escribirFilaSinArray(ruta2,datos2);
        } while (opcion.equals("S"));



    }
}
