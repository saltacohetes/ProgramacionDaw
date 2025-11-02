package Relacion_4;

import java.util.Random;

public class Ejercicio13 {
    public static void main() {
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String password = "";
        int i = 0;

        while (i < 8) {
            int indice = random.nextInt(caracteres.length());
            password += caracteres.charAt(indice);
            i++;
        }

        System.out.println("Contraseña generada: " + password);
    }
}
