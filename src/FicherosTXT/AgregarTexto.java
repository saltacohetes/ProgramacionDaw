import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AgregarTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese texto a agregar: ");
        String texto = sc.nextLine();

        try (FileWriter fw = new FileWriter("archivo1.txt", true)) {
            fw.write("\n" + texto);
            System.out.println("Texto agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar texto.");
        }
    }
}