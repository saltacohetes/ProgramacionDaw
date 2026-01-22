package Ejercicio5CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//5. Leer un archivo CSV y contar el número total de líneas presentes en él. Mostrar el resultado en la consola.
public class ContarLineasCSV {

public static void contarLineasCSV(String ruta) {
        BufferedReader br = null;
        int contador = 0;

        try {
            FileReader fr = new FileReader(ruta);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                contador++;
            }
            System.out.println("Número total de líneas: " + contador);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("NO SE PUEDE CERRAR EL FICHERO");
                }
            }
        }
    }
}
