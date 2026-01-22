package Ejercicio10CSV;

import java.util.Scanner;
public class Main {
    static void main() {
        String ruta1 = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio10CSV/datos.csv";
        String ruta2 = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio10CSV/datos2.csv";
        String destino = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio10CSV/combinao.csv";

        Leer.CombinarCSV(ruta1, ruta2, destino);

        System.out.println("Archivo combinado.csv creado correctamente");

    }
}
