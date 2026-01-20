import java.io.File;
import java.util.Scanner;

public class EliminarArchivo {
    public static void main(String[] args) {
        File archivo = new File("archivo2.txt");
        Scanner sc = new Scanner(System.in);

        if (archivo.exists()) {
            System.out.print("¿Desea eliminar el archivo? (s/n): ");
            String opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("s")) {
                if (archivo.delete()) {
                    System.out.println("Archivo eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }
}