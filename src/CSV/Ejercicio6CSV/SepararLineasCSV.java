package Ejercicio6CSV;

//6. Leer un archivo CSV, separar cada línea en sus componentes (por ejemplo, nombre, edad, ciudad) y mostrar cada uno de ellos en la consola.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  SepararLineasCSV {
        public static void separarLineasCSV(String ruta) {
            BufferedReader br = null;

            try {
                FileReader fr = new FileReader(ruta);
                br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null) {

                    String[] datos = linea.split(",");

                    System.out.println("Apellido: " + datos[0]);
                    System.out.println("Codigo Postal: " + datos[1]);
                    System.out.println("Móvil: " + datos[2]);
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        System.out.println("ERROR AL CERRAR EL FICHERO DE LECTURA");
                    }
                }
            }
        }
    }