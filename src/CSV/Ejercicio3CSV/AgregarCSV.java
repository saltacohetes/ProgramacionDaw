package Ejercicio3CSV;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AgregarCSV {
    public static void escribirCabecera(String path, String[] datos){
        // Forma 1: String datos nombre,edad,cuidad
        // Forma 2 (Este ejercicio):
        /*
         * datos[0] = nombre
         * datos[1] = edad
         * .....
         *          */
        if(datos.length != 3){
            System.out.println("Faltando datos o sobran");
            return;
        }

        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(path,true);
            bw = new BufferedWriter(fw);
            //nombre,edad,cuidad
            String escribir = datos[0] + "," + datos[1] + "," + datos[2];
            bw.write(escribir);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if (bw!=null){
                try{
                    bw.close();
                } catch (Exception e){
                    throw new RuntimeException(e.getMessage());
                }
            }
        }
    }

    public static void escribirFila(String path, String[] datos){
        if(datos.length != 3){
            System.out.println("Faltando datos o sobran");
            return;
        }

        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(path,true);
            bw = new BufferedWriter(fw);
            //nombre,edad,cuidad
            String escribir = datos[0] + "," + datos[1] + "," + datos[2];
            bw.write(escribir);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if (bw!=null){
                try{
                    bw.close();
                } catch (Exception e){
                    throw new RuntimeException(e.getMessage());
                }
            }
        }
    }

    public static void escribirFilaSinArray(String path, String datos){
        // Forma 1: String datos nombre,edad,cuidad
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(path,true);
            bw = new BufferedWriter(fw);
            //nombre,edad,cuidad
            bw.write(datos);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if (bw!=null){
                try{
                    bw.close();
                } catch (Exception e){
                    throw new RuntimeException(e.getMessage());
                }
            }
        }
    }
}
