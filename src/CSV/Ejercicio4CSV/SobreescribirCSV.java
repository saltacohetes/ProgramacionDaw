package Ejercicio4CSV;

//4. Escribir un programa que sobrescriba todo el contenido de un archivo CSV con nuevas líneas ingresadas por el usuario.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SobreescribirCSV {
    public static void sobreescribirCSV(String path, String datos) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))){
            bw.write(datos);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
