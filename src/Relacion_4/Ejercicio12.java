package Relacion_4;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE OPCIONES ===");
            System.out.println("1. Contar caracteres en una cadena");
            System.out.println("2. Invertir una cadena");
            System.out.println("3. Contar vocales en una cadena");
            System.out.println("4. Verificar si es palíndromo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa una cadena: ");
                    String cadena1 = sc.nextLine();
                    int contador = 0;
                    int i = 0;
                    while (i < cadena1.length()) {
                        contador++;
                        i++;
                    }
                    System.out.println("La cadena tiene " + contador + " caracteres");
                    break;

                case 2:
                    System.out.print("Ingresa una cadena: ");
                    String cadena2 = sc.nextLine();
                    String invertida = "";
                    int j = cadena2.length() - 1;
                    while (j >= 0) {
                        invertida += cadena2.charAt(j);
                        j--;
                    }
                    System.out.println("Cadena invertida: " + invertida);
                    break;

                case 3:
                    System.out.print("Ingresa una cadena: ");
                    String cadena3 = sc.nextLine();
                    int vocales = 0;
                    int k = 0;
                    while (k < cadena3.length()) {
                        char letra = Character.toLowerCase(cadena3.charAt(k));
                        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                            vocales++;
                        }
                        k++;
                    }
                    System.out.println("La cadena tiene " + vocales + " vocales");
                    break;

                case 4:
                    System.out.print("Ingresa una cadena: ");
                    String cadena4 = sc.nextLine();
                    String limpia = cadena4.replaceAll("\\s+", "").toLowerCase();
                    int inicio = 0;
                    int fin = limpia.length() - 1;
                    boolean esPalindromo = true;
                    while (inicio < fin) {
                        if (limpia.charAt(inicio) != limpia.charAt(fin)) {
                            esPalindromo = false;
                            break;
                        }
                        inicio++;
                        fin--;
                    }
                    if (esPalindromo) {
                        System.out.println("'" + cadena4 + "' ES un palíndromo");
                    } else {
                        System.out.println("'" + cadena4 + "' NO es un palíndromo");
                    }
                    break;

                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
