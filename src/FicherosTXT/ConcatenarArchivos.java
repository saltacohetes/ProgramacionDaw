import java.io.*;

public class ConcatenarArchivos {
    public static void main(String[] args) {
        try (
            BufferedReader br1 = new BufferedReader(new FileReader("archivo1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("archivo2.txt"));
            FileWriter fw = new FileWriter("archivo3.txt")
        ) {
            String linea;

            while ((linea = br1.readLine()) != null) {
                fw.write(linea + "\n");
            }
            while ((linea = br2.readLine()) != null) {
                fw.write(linea + "\n");
            }

            System.out.println("Archivos concatenados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al concatenar archivos.");
        }
    }
}