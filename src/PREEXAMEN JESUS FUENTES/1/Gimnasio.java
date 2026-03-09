import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Gimnasio {
    private ArrayList<Socio> socios;
    private Scanner scanner;


    public Gimnasio() {
        socios = new ArrayList<>();
        scanner = new Scanner(System.in);
        inicializarSocios();
    }


    private void inicializarSocios() {
        socios.add(new Socio("Ana García", "12345678A", 25, "01/01/2024"));
        socios.add(new Socio("Carlos López", "87654321B", 30, "15/01/2024"));
        socios.add(new Socio("María Martín", "45678912C", 22, "20/01/2024"));
        socios.add(new Socio("Juan Pérez", "78912345D", 35, "05/02/2024"));
        socios.add(new Socio("Laura Sánchez", "32165498E", 28, "10/02/2024"));

        System.out.println("5 socios iniciales hechos.");
    }


    public void ejecutarMenu() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 6);
    }


    private void mostrarMenu() {
        System.out.println("\nGIMNASIO - MENÚ PRINCIPAL");
        System.out.println("1. Alta de socio");
        System.out.println("2. Baja de socio (marcar como inactivo)");
        System.out.println("3. Listado de socios ACTIVOS (ordenados por nombre)");
        System.out.println("4. Listado de socios INACTIVOS (ordenados por DNI)");
        System.out.println("5. Borrar socio (eliminar del sistema)");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }


    private int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }


    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                altaSocio();
                break;
            case 2:
                bajaSocio();
                break;
            case 3:
                listarSociosActivos();
                break;
            case 4:
                listarSociosInactivos();
                break;
            case 5:
                borrarSocio();
                break;
            case 6:
                System.out.println("Gracias por usar esto");
                break;
            default:
                System.out.println("No, prueba de nuevo");
        }

        if (opcion != 6) {
            System.out.println("\nPresiona alguna tecla para continuar...");
            scanner.nextLine();
        }
    }


    private void altaSocio() {
        System.out.println("\n--- ALTA DE NUEVO SOCIO ---");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        if (buscarSocioPorDni(dni) != null) {
            System.out.println("Error: Ya existe un socio con ese DNI.");
            return;
        }

        System.out.print("Edad: ");
        int edad;
        try {
            edad = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Edad no válida.");
            return;
        }

        System.out.print("Fecha de inscripción (dd/mm/aaaa): ");
        String fecha = scanner.nextLine();

        Socio nuevoSocio = new Socio(nombre, dni, edad, fecha);
        socios.add(nuevoSocio);

        System.out.println("Socio dado de alta");
        System.out.println(nuevoSocio);
    }


    private void bajaSocio() {
        System.out.println("\n--- BAJA DE SOCIO ---");
        System.out.print("Introduzca DNI del socio: ");
        String dni = scanner.nextLine();

        Socio socio = buscarSocioPorDni(dni);

        if (socio == null) {
            System.out.println("No se encontró ningún socio con ese DNI.");
            return;
        }

        if (!socio.isActivo()) {
            System.out.println("El socio ya está inactivo.");
            return;
        }

        socio.setActivo(false);
        System.out.println("Socio marcado como INACTIVO correctamente:");
        System.out.println(socio);
    }


    private void listarSociosActivos() {
        System.out.println("\n--- SOCIOS ACTIVOS (ordenados por nombre) ---");

        // Crear lista de socios activos
        ArrayList<Socio> activos = new ArrayList<>();
        for (Socio s : socios) {
            if (s.isActivo()) {
                activos.add(s);
            }
        }

        if (activos.isEmpty()) {
            System.out.println("No hay socios activos en el gimnasio.");
            return;
        }


        Collections.sort(activos, new Comparator<Socio>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                return s1.getNombre().compareToIgnoreCase(s2.getNombre());
            }
        });


        System.out.println("Total de socios activos: " + activos.size());
        for (int i = 0; i < activos.size(); i++) {
            System.out.println("\n" + (i + 1) + ". " + activos.get(i));
        }
    }


    private void listarSociosInactivos() {
        System.out.println("\n--- SOCIOS INACTIVOS (ordenados por DNI) ---");

        ArrayList<Socio> inactivos = new ArrayList<>();
        for (Socio s : socios) {
            if (!s.isActivo()) {
                inactivos.add(s);
            }
        }

        if (inactivos.isEmpty()) {
            System.out.println("No hay socios inactivos en el gimnasio.");
            return;
        }

        Collections.sort(inactivos, new Comparator<Socio>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                return s1.getDni().compareToIgnoreCase(s2.getDni());
            }
        });

        System.out.println("Total de socios inactivos: " + inactivos.size());
        for (int i = 0; i < inactivos.size(); i++) {
            System.out.println("\n" + (i + 1) + ". " + inactivos.get(i));
        }
    }


    private void borrarSocio() {
        System.out.println("\n--- ELIMINAR SOCIO ---");
        System.out.print("Introduzca DNI del socio a eliminar: ");
        String dni = scanner.nextLine();

        Socio socio = buscarSocioPorDni(dni);

        if (socio == null) {
            System.out.println("No se encontró ningún socio con ese DNI.");
            return;
        }

        System.out.println("Socio encontrado:");
        System.out.println(socio);
        System.out.print("¿Está seguro de eliminar este socio? (S/N): ");
        String confirmacion = scanner.nextLine();

        if (confirmacion.equalsIgnoreCase("S")) {
            socios.remove(socio);
            System.out.println("Socio eliminado correctamente.");
        } else {
            System.out.println("Operación cancelada.");
        }
    }


    private Socio buscarSocioPorDni(String dni) {
        for (Socio s : socios) {
            if (s.getDni().equalsIgnoreCase(dni)) {
                return s;
            }
        }
        return null;
    }
}