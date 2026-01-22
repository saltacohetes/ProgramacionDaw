package Ejercicio4CSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String path = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio4CSV/datos.csv";
        String datos = "apellido, ciudad, dni";
        SobreescribirCSV.sobreescribirCSV(path,datos);
        String opcion;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce tu apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Introduce tu ciudad: ");
            String ciudad = sc.nextLine();
            System.out.println("Introduce tu dni: ");
            String dni = sc.nextLine();

            System.out.println("¿Quieres seguir introduciendo datos? S/N:  ");
            opcion = sc.nextLine();
            opcion = opcion.toLowerCase();
            datos = apellido + "," + ciudad + "," + dni;
            SobreescribirCSV.sobreescribirCSV(path,datos);

        }while (opcion.equals("s"));
    }
}
