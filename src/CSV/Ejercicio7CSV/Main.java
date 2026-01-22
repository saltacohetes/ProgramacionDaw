package Ejercicio7CSV;

public class Main {
    public static void main(String[] args) {

        String origen = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio7CSV/datos.csv";
        String destino = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio7CSV/CopiaDeDatos.csv";

        CopiarCSV.copiarCSV(origen, destino);
    }
}