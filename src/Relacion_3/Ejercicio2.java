package Relacion_3;
//Ejercicio 2: Cálculo de descuentos en una tienda
//Un programa que solicite el precio de un producto y el tipo de cliente.
//Dependiendo del tipo de cliente, aplicar diferentes descuentos:
//- Cliente regular: 5%
//- Cliente premium: 10%
//- Cliente VIP: 20%
//Si el precio es mayor a 500 y el cliente es VIP, aplicar un descuento adicional del 5%.
import java.util.Scanner;

public class Ejercicio2 {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        int precio;
        double descuento = 0.0;

        System.out.println("Introduzca el precio del producto: ");
        precio = sc.nextInt();

        System.out.println("Introduzca su categoria de cliente");
        System.out.println("1. Regular");
        System.out.println("2. Premium");
        System.out.println("3. VIP");
        int categoria = sc.nextInt();

        if (categoria == 1) {
            descuento = 0.05;
        }
        else if (categoria == 2) {
            descuento = 0.1;
        }
        else if (categoria == 3) {
            descuento = 0.2;

            if (precio > 500) {
                descuento = 0.25;
            }
        }

        double resultado = precio - (precio * descuento);
        System.out.println("Su precio final es de: "+resultado);
    }
}
