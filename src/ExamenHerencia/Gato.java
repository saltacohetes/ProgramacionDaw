package ExamenHerencia;

import java.util.Scanner;

public class Gato extends Animal {
    private boolean tieneCola;
    private int vidasRestantes;

    public Gato() {
        super();
        this.tieneCola = true;
        this.vidasRestantes = 7;
    }

    public Gato(String nombre, String especie, int edad, boolean tieneCola, int vidasRestantes) {
        super(nombre, especie, edad);
        this.tieneCola = tieneCola;
        this.vidasRestantes = vidasRestantes;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + nombre + " maúlla: miau miau");
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato " + nombre + " come pescado");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene cola: " + (tieneCola ? "Sí" : "No"));
        System.out.println("Vidas restantes: " + vidasRestantes);
    }

    public void saltar(int veces) {
        System.out.print(nombre + " salta");
        for (int i = 0; i < veces; i++) {
            System.out.print(" *salto*");
            if (i < veces - 1) {
                System.out.print(" y");
            }
        }
        System.out.println("!");
    }

    public static Gato crearGatoPorConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crea nuevo gatito");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Especie: ");
        String especie = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("¿Tiene cola? (true/false): ");
        boolean tieneCola = scanner.nextBoolean();

        System.out.print("Vidas restantes: ");
        int vidasRestantes = scanner.nextInt();

        return new Gato(nombre, especie, edad, tieneCola, vidasRestantes);
    }

    public boolean isTieneCola() {
        return tieneCola;
    }

    public void setTieneCola(boolean tieneCola) {
        this.tieneCola = tieneCola;
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }
}