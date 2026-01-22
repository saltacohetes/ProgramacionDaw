package Ejercicio8CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirCSV {
    public static void SobreEscribir(String path, String datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, false))) {
            bw.write(datos);
            bw.newLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void Añadir(String path, String datos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(datos);
            bw.newLine();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}