package Ejercicio9CSV;

public class Main {
    public static void main(String[] args) throws Exception {
        String path = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio9CSV/datos.csv";
        String path2 = "/home/fuentes/IdeaProjects/RElacion_1_Ej_3/src/Ejercicio9CSV/ordenado.csv";
        boolean cabecera = true;

        OrdenarLinea.ordenar(path, path2, cabecera);
    }
}
