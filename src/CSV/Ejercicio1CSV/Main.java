package Ejercicio1CSV;

import java.util.Scanner;

/*
 * Clase principal
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        String edad = scanner.nextLine();

        System.out.print("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();

        // Creamos el array de datos
        String[] datos = { nombre, edad, ciudad };

        // Llamamos al método estático
        EscribirDatosCSV.EscribirDatosCSV("/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio1CSV/datos.csv", datos);

        System.out.println("Datos guardados correctamente");

        scanner.close();
    }
}
