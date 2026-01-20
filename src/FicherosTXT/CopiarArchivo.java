import java.io.*;

public class CopiarArchivo {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
            FileWriter fw = new FileWriter("archivo2.txt")
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fw.write(linea + "\n");
            }
            System.out.println("Archivo copiado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo.");
        }
    }
}