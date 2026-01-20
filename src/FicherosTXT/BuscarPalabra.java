import java.io.*;
import java.util.Scanner;

public class BuscarPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = sc.nextLine();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String p : palabras) {
                    if (p.equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }
            System.out.println("La palabra aparece " + contador + " veces.");
        } catch (IOException e) {
            System.out.println("Error al buscar la palabra.");
        }
    }
}