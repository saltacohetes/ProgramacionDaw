package Relacion_4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = sc.nextInt();

        int i = 1;

        while (i <= N) {
            System.out.println(i);
            i++;
        }

        sc.close();
    }
}
