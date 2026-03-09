package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parking miParking = new Parking();
        Scanner sc = new Scanner(System.in);

        miParking.agregarVehiculo(new Vehiculo("1234ABC", "Jaimito", "08:00", 5));
        miParking.agregarVehiculo(new Vehiculo("5678DEF", "Menganito", "08:30", 2));
        miParking.agregarVehiculo(new Vehiculo("9012GHI", "Jesus", "09:00", 10));
        miParking.agregarVehiculo(new Vehiculo("3456JKL", "Adri", "09:15", 1));
        miParking.agregarVehiculo(new Vehiculo("7890MNP", "Esquirol", "09:45", 7));

        int opcion = 0;
        do {
            System.out.println("\n--- GESTIÓN DE PARKING ---");
            System.out.println("1. Entrada de vehículo");
            System.out.println("2. Salida de vehículo (Pago)");
            System.out.println("3. Listar pendientes (por plaza)");
            System.out.println("4. Listar pagados (por propietario)");
            System.out.println("5. Borrar vehículo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Matrícula: "); String mat = sc.nextLine();
                    System.out.print("Propietario: "); String prop = sc.nextLine();
                    System.out.print("Hora (HH:mm): "); String hora = sc.nextLine();
                    System.out.print("Plaza: "); int plaza = sc.nextInt();
                    if (miParking.agregarVehiculo(new Vehiculo(mat, prop, hora, plaza))) {
                        System.out.println("Vehículo registrado.");
                    } else {
                        System.out.println("Error: Matrícula duplicada.");
                    }
                    break;
                case 2:
                    System.out.print("Matrícula a pagar: ");
                    if (miParking.pagarVehiculo(sc.nextLine())) System.out.println("Pago registrado.");
                    else System.out.println("No encontrado.");
                    break;
                case 3: miParking.listarPendientes(); break;
                case 4: miParking.listarPagados(); break;
                case 5:
                    System.out.print("Matrícula a borrar: ");
                    if (miParking.borrarVehiculo(sc.nextLine())) System.out.println("Vehículo eliminado.");
                    else System.out.println("No encontrado.");
                    break;
            }
        } while (opcion != 6);

        System.out.println("Aplicación cerrada.");
    }
}


