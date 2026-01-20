import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    public static void main(String[] args) {
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"))) {
            while (br.readLine() != null) {
                contador++;
            }
            System.out.println("Total de líneas: " + contador);
        } catch (IOException e) {
            System.out.println("Error al contar líneas.");
        }
    }
}