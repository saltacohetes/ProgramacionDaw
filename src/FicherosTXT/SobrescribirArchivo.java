import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SobrescribirArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nuevo texto: ");
        String texto = sc.nextLine();

        try (FileWriter fw = new FileWriter("archivo1.txt")) {
            fw.write(texto);
            System.out.println("Archivo sobrescrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al sobrescribir el archivo.");
        }
    }
}