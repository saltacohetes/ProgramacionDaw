package Ejercicio7CSV;

//7. Crear un programa que copie el contenido de un archivo CSV existente en un nuevo archivo llamado 'copia_datos.csv'.

import java.io.*;

public class CopiarCSV {
        public static void copiarCSV(String ArchivoOrigen, String ArchivoDestino) {

        BufferedReader br = null;
        BufferedWriter bw = null;

            try {
            br = new BufferedReader(new FileReader(ArchivoOrigen));
            bw = new BufferedWriter(new FileWriter(ArchivoDestino));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("Archivo copiado correctamente.");

        } catch (
        IOException e) {
            System.err.println(e.getMessage());
        } finally {

            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar archivos");
            }
        }
    }
}

