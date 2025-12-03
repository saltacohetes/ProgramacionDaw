package ExamenHerencia;

import java.util.Scanner;

public class Perro extends Animal {
    private String raza;
    private boolean entrenado;

    public Perro() {
        super();
        this.raza = "";
        this.entrenado = false;
    }

    public Perro(String nombre, String especie, int edad, String raza, boolean entrenado) {
        super(nombre, especie, edad);
        this.raza = raza;
        this.entrenado = entrenado;
    }


    @Override
    public void hacerSonido() {
        System.out.println("El perro " + nombre + " ladra: ¡Guau, guau!");
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro " + nombre + " está comiendo pienso.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: " + raza);
        System.out.println("Entrenado: " + (entrenado ? "Sí" : "No"));
    }

    public void moverCola(int veces) {
        System.out.print(nombre + " mueve la cola");
        for (int i = 0; i < veces; i++) {
            System.out.print(" *mueve*");
            if (i < veces - 1) {
                System.out.print(" y");
            }
        }
        System.out.println("!");
    }

    public static Perro crearPerroPorConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crea nuevo perrito");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Especie: ");
        String especie = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Raza: ");
        String raza = scanner.nextLine();

        System.out.print("¿Está entrenado?: ");
        boolean entrenado = scanner.nextBoolean();

        return new Perro(nombre, especie, edad, raza, entrenado);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEntrenado() {
        return entrenado;
    }

    public void setEntrenado(boolean entrenado) {
        this.entrenado = entrenado;
    }
}
