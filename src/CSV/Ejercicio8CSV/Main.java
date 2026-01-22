package Ejercicio8CSV;

public class Main {
    public static void main(String[] args) {

        String origen = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio8CSV/datos.csv";
        String destino = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio8CSV/merge.csv";
        AñadirEdad.añadiredad(origen, destino);
        System.out.println("Archivo adultos.csv generado correctamente");

    }
}
