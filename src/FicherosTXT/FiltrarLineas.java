import java.io.*;
import java.util.Scanner;

public class FiltrarLineas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese palabra a filtrar: ");
        String palabra = sc.nextLine();

        try (
            BufferedReader br = new BufferedReader(new FileReader("archivo1.txt"));
            FileWriter fw = new FileWriter("filtrado.txt")
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabra)) {
                    fw.write(linea + "\n");
                }
            }
            System.out.println("Archivo filtrado creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al filtrar archivo.");
        }
    }
}