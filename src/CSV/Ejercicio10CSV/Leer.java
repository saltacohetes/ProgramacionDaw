package Ejercicio10CSV;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Leer {

    public static void CombinarCSV(String ruta1, String ruta2, String rutaDestino) {

        Set<String> lineas = new HashSet<>();
        String cabecera = "";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta1))) {
            cabecera = br.readLine();
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(ruta2))) {
            br.readLine();
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        Escribir.SobreEscribir(rutaDestino, cabecera);
        for (String l : lineas) {
            Escribir.Añadir(rutaDestino, l);
        }
    }
}