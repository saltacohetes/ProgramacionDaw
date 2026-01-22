package Ejercicio2CSV;

//2. Leer y mostrar el contenido de un archivo CSV llamado 'datos.csv' en la consola, línea por línea.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerDatosCSV {
    public static void LeerDatosCSV(String path) {
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(path);
            br = new BufferedReader(fr);
            String fila;
            while ((fila = br.readLine()) != null){
                System.out.println(fila);
            }
    }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
        if (br != null){
            try {
                br.close();
            }catch (IOException e){
                System.out.println("Error al cerrar el fichero");
            }
        }
        }
    }
}
