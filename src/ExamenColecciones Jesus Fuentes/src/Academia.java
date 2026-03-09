import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Academia {
    private static ArrayList<Alumno> alumnos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public Academia() {
        this.alumnos = new ArrayList<>();
        this.sc = new Scanner(System.in);
        inicializarAlumnos();
    }

    private void inicializarAlumnos() {
        alumnos.add(new Alumno("Jaimito", "12122345P", "Segundo", "12/12/26", true));
        alumnos.add(new Alumno("Menganito", "22122345P", "Segundo", "07/11/26", true));
        alumnos.add(new Alumno("Jesus", "32122345P", "Primero", "12/10/26", true));
        alumnos.add(new Alumno("Adri", "42122345P", "Primero", "10/10/26", true));
        alumnos.add(new Alumno("Esquirol", "52122345P", "Primero", "11/11/26", true));

        System.out.println("Creados los 5 primeros alumnos");
    }

    public void Iniciar() {
        int opcion;
        do {
            System.out.println("\nSENECA");
            System.out.println("1. Alta de alumno");
            System.out.println("2. Baja de alumno");
            System.out.println("3. Listado de alumnos ACTIVOS");
            System.out.println("4. Listado de alumnos INACTIVOS");
            System.out.println("5. Borrar alumno");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    altaAlumno();
                    break;
                case 2:
                    bajaAlumno();
                    break;
                case 3:
                    listarAlumnosActivos();
                    break;
                case 4:
                    listarAlumnosInactivos();
                    break;
                case 5:
                    borrarAlumno();
                    break;
                case 6:
                    System.out.println("Gracias por usar el sistema seneca");
                    break;
                default:
                    System.out.println("No, prueba de nuevo");
            }
        } while (opcion != 6);
    }

    private Alumno buscarAlumnoPorDni(String dni) {
        for (Alumno a : alumnos) {
            if (a.getDni().equalsIgnoreCase(dni)) {
                return a;
            }
        }
        return null;
    }

    private void altaAlumno() {
        System.out.println("\n--- ALTA DE NUEVO ALUMNO ---");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        if (buscarAlumnoPorDni(dni) != null) {
            System.out.println("Error: Ya existe un alumno con ese DNI.");
            return;
        }

        System.out.print("Edad: ");
        int edad;
        try {
            edad = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Edad no válida.");
            return;
        }

        System.out.print("Fecha de inscripción (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        Alumno nuevoAlumno = new Alumno(nombre, dni, "", fecha, true );
        alumnos.add(nuevoAlumno);

        System.out.println("Socio dado de alta");
        System.out.println(nuevoAlumno);
    }


    private void bajaAlumno() {
        System.out.println("\n--- BAJA DE ALUMNO ---");
        System.out.print("Introduzca DNI del alumno: ");
        String dni = sc.nextLine();

        Alumno alumno = buscarAlumnoPorDni(dni);

        if (alumno == null) {
            System.out.println("No se encontró ningún alumno con ese DNI.");
            return;
        }

        if (!alumno.isActivo()) {
            System.out.println("El alumno ya está inactivo.");
            return;
        }

        alumno.setActivo(false);
        System.out.println("Alumno marcado como INACTIVO correctamente:");
        System.out.println(alumno);
    }

    private void listarAlumnosActivos() {
        System.out.println("\n--- ALUMNOS ACTIVOS ---");

        ArrayList<Alumno> activos = new ArrayList<>();
        for (Alumno a : alumnos) {
            if (a.isActivo()) {
                activos.add(a);
            }
        }
        if (activos.isEmpty()) {
            System.out.println("Este alumno no esta activo en seneca.");
            return;
        }


        Collections.sort(activos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.getNombre().compareToIgnoreCase(a2.getNombre());
            }
        });


        System.out.println("Total de alumnos activos: " + activos.size());
        for (int i = 0; i < activos.size(); i++) {
            System.out.println("\n" + (i + 1) + ". " + activos.get(i));
        }
    }

    private void listarAlumnosInactivos() {
        System.out.println("\n--- ALUMNOS INACTIVOS ---");

        ArrayList<Alumno> inactivos = new ArrayList<>();
        for (Alumno a : alumnos) {
            if (!a.isActivo()) {
                inactivos.add(a);
            }
        }

        if (inactivos.isEmpty()) {
            System.out.println("No hay alumnos inactivos.");
            return;
        }

        Collections.sort(inactivos, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.getDni().compareToIgnoreCase(a2.getDni());
            }
        });

        System.out.println("Total de alumnos inactivos: " + inactivos.size());
        for (int i = 0; i < inactivos.size(); i++) {
            System.out.println("\n" + (i + 1) + ". " + inactivos.get(i));
        }
    }

    private void borrarAlumno() {
        System.out.println("\n--- ELIMINAR SOCIO ---");
        System.out.print("Introduzca DNI del socio a eliminar: ");
        String dni = sc.nextLine();

        Alumno alumno = buscarAlumnoPorDni(dni);

        if (alumno == null) {
            System.out.println("No se encontró ningún alumno con ese DNI.");
            return;
        }else  {
            System.out.println("Alumno eliminado exitosamente.");
            alumnos.remove(alumno);
        }
    }
}


