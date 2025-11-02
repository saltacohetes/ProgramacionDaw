package Relacion_4;

public class Ejercicio20 {
    public static void main() {
        int i = 1;

        System.out.println("Múltiplos de 5 entre 1 y 100:");

        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

