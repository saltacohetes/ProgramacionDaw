package Ejercicio1CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ==========================
 * CLASE UtilidadesCSV
 * ==========================
 * Esta clase contiene métodos estáticos
 * para trabajar con archivos CSV.
 *
 * No se crean objetos de esta clase.
 */
public class EscribirDatosCSV {

    /*
     * Método escribirDatosCSV
     *
     * Parámetros:
     * - path: ruta y nombre del archivo (ej: "datos.csv")
     * - datos: array de Strings con la información
     *          datos[0] -> nombre
     *          datos[1] -> edad
     *          datos[2] -> ciudad
     *
     * Función:
     * Escribe una línea en el archivo CSV
     * con formato: nombre,edad,ciudad
     */
    public static void EscribirDatosCSV(String path, String[] datos) {

        // Declaramos el BufferedWriter fuera del try
        // para poder cerrarlo en el finally
        BufferedWriter bw = null;

        try {
            // FileWriter abre o crea el archivo
            // true = escribe al final sin borrar lo anterior
            FileWriter fw = new FileWriter(path, true);

            // BufferedWriter mejora la escritura
            bw = new BufferedWriter(fw);

            // Construimos la línea CSV
            // nombre,edad,ciudad
            String escribir = datos[0] + "," + datos[1] + "," + datos[2];

            // Escribimos la línea en el archivo
            bw.write(escribir);

            // Salto de línea
            bw.newLine();

        } catch (IOException e) {

            // Lanzamos una excepción si ocurre un error
            throw new RuntimeException("Error al escribir el CSV: " + e.getMessage());

        } finally {

            // Nos aseguramos de cerrar el BufferedWriter
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }

}

