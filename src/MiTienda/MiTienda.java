package Tienda;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class MiTienda {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sc.useLocale(Locale.US); // Para separar decimales con punto

        //=====================================================================
        // DEFINIR LAS VARIABLES (FINAL SI PROCEDE) NECESARIAS AQUI ARRIBA
        final double IVA = 21.0; // % del IVA
        Random random = new Random();

        // VARIABLES PARA EL DESCUENTO ALEATORIO (entre 5% y 10%)
        //Antonio esto lo busque en el gepeto porque me apetecia perdon perolo voy a dejar porque esta muy chulo y me es muy util aunque creo que lo vimos (Lo anterior es del miercoles hoyviernes estoy como 90ç5 eguro de haberlo visto)
        //Esto genera un numero entre 5 y 10 ya que el numero incial es 5 y el maximo 10 porque le sumo 6.
        double descuentoAleatorio = 5 + random.nextInt(6);

        //=====================================================================
        // ASIGNAR EL NOMBRE DE LOS PRODUCTOS
        String articulo1 = "El diario secreto de Laura Palmer";
        String articulo2 = "Comic Superman All Star";
        String articulo3 = "Warhammer 40.000 LA guia visual definitiva";
        String articulo4 = "Pies de barro, una novela del Mundodisco";
        String articulo5 = "El arte de hacer manga, Teoría & Práctica";

        // ASIGNAR EL PRECIO DE LOS PRODUCTOS (sin IVA)11
        double precio1 = 99.99;
        double precio2 = 24.50;
        double precio3 = 33.25;
        double precio4 = 12.30;
        double precio5 = 11.40;

        //=====================================================================
        // IMPRIMIR EL MENSAJE DE BIENVENIDA
        System.out.println("==============================================");
        System.out.println("        🛍️  BIENVENIDO A LA LIBRERIA 55 🛍️");
        System.out.println("==============================================");
        System.out.println("Gracias por visitar nuestra web");
        //El \n es un salto de linea no lo olvides
        System.out.println("Aquí podrás encontrar los libros que buscas!!!.\n");

        // IMPRIMIR EL LOGOTIPO
        //Dibujo totalmente pedido a gepeto
        System.out.println("        ╔═══════════════════════════╗");
        System.out.println("        ║ 👕  L I B R E R I A    5 5 👟 ║");
        System.out.println("        ╚═══════════════════════════╝\n");

        //=====================================================================
        // IMPRIMIR TABLA DE PRODUCTOS CON SUS PRECIOS
        System.out.println("🧾 TABLA DE PRECIOS (sin IVA):");
        System.out.printf("%-25s ...... %.2f €%n", articulo1, precio1);
        System.out.printf("%-25s ...... %.2f €%n", articulo2, precio2);
        System.out.printf("%-25s ...... %.2f €%n", articulo3, precio3);
        System.out.printf("%-25s ...... %.2f €%n", articulo4, precio4);
        System.out.printf("%-25s ...... %.2f €%n", articulo5, precio5);
        System.out.println();

        //=====================================================================
        // PEDIR LA CANTIDAD QUE EL CLIENTE QUIERE COMPRAR DE CADA PRODUCTO
        System.out.print("Cantidad deseada de " + articulo1 + ": ");
        int cantidad1 = sc.nextInt();
        System.out.print("Cantidad deseada de " + articulo2 + ": ");
        int cantidad2 = sc.nextInt();
        System.out.print("Cantidad deseada de " + articulo3 + ": ");
        int cantidad3 = sc.nextInt();
        System.out.print("Cantidad deseada de " + articulo4 + ": ");
        int cantidad4 = sc.nextInt();
        System.out.print("Cantidad deseada de " + articulo5 + ": ");
        int cantidad5 = sc.nextInt();
        //Pa limpiar el buffer
        sc.nextLine();

        //=====================================================================
        // PREGUNTAR EL NOMBRE AL CLIENTE PARA LA FACTURA
        System.out.print("\nEscriba su nombre completo: ");
        String nombreCliente = sc.nextLine();


        //====================================================================
        // CALCULAR TODO LO NECESARIO DE LA FORMA QUE ESTIMEIS OPORTUNATODO LO NECESARIO DE LA FORMA QUE ESTIMEIS OPORTUNA

        // Calcular totales sin IVA
        double totalSinIVA = (cantidad1 * precio1) + (cantidad2 * precio2) + (cantidad3 * precio3)
                + (cantidad4 * precio4) + (cantidad5 * precio5);

        // Calcular IVA repercutido
        double valorIVA = totalSinIVA * (IVA / 100);

        // Calcular total con IVA
        double totalConIVA = totalSinIVA + valorIVA;

        // Calcular descuento
        double valorDescuento = totalConIVA * (descuentoAleatorio / 100);
        double totalFinal = totalConIVA - valorDescuento;

        // Formatear nombre del cliente
        String nombreMayus = nombreCliente.toUpperCase();
        int espacio = nombreCliente.indexOf(' ');
        String primerNombre = (espacio != -1) ? nombreCliente.substring(0, espacio) : nombreCliente;
        primerNombre = primerNombre.substring(0, 1).toUpperCase() + primerNombre.substring(1).toLowerCase();

        //====================================================================
        // SR/SRA AQUI TIENE SU FACTURA
        System.out.println("\n==============================================");
        System.out.println("        🧾 FACTURA DE COMPRA 🧾");
        System.out.println("==============================================");
        System.out.println("Sr/Sra " + primerNombre + ", aquí tiene el resumen de su factura:");
        System.out.println("----------------------------------------------");
        System.out.println("Nombre cliente: " + nombreMayus);
        System.out.printf("", articulo1, cantidad1);
        System.out.printf(articulo2, cantidad2);
        System.out.printf(articulo3, cantidad3);
        System.out.printf(articulo4, cantidad4);
        System.out.printf(articulo5, cantidad5);
        System.out.println("----------------------------------------------");
        //Yo necesito una chuleta con esto porque se lo he tenido que pedir a gepeto (Me refiero a los epsacios y decimales y eso)
        System.out.printf("Total sin IVA: %.2f €%n", totalSinIVA);
        System.out.printf("IVA aplicado: %.0f%%%n", IVA);
        System.out.printf("IVA repercutido: %.2f €%n", valorIVA);
        System.out.printf("Total con IVA: %.2f €%n", totalConIVA);
        System.out.printf("Descuento por 1ª vez: %.0f%%%n", descuentoAleatorio);
        System.out.printf("Valor descontado: %.2f €%n", valorDescuento);
        System.out.printf("TOTAL FINAL: "+totalFinal);


        //====================================================================
        // IMPRIMIR MENSAJE DE DESPEDIDA
        System.out.println("\nGracias por comprar en nuestra libreria!!!👗👞");
        System.out.println("¡Esperamos volver a verle pronto! 💖");

    }
}
