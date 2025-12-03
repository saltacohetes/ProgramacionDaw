package ExamenHerencia;

public class Main {
    public static void main() {
        System.out.println("BIENVENIDO AL ZOOAPP");

        /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Creamos los animales");

        System.out.println("Creando Perro");
        Perro p1 = new Perro("Leo", "Canis Lupus", 14, "Podenco", true);

        System.out.println("Creando Gato");
        Gato g1 = new Gato("Niebla", "Felis Catus", 1, true, 6);

        System.out.println("Creando Loro");
        Loro l1 = new Loro("Luis", "Pájaro", 19, "Verde y amarillas", true);

        /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Detalles de los animales");

        System.out.println("Detalles del perro:");
        p1.mostrarDetalles();

        System.out.println("Detalles del gato:");
        g1.mostrarDetalles();

        System.out.println("Detalles del loro:");
        l1.mostrarDetalles();

        /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Compara edades");

        System.out.println("¿" + p1.getNombre() + " es mayor que " + g1.getNombre() + "? " +
                (p1.esMayor(g1) ? "Sí" : "No"));

        System.out.println("¿" + g1.getNombre() + " es mayor que " + l1.getNombre() + "? " +
                (g1.esMayor(l1) ? "Sí" : "No"));

        System.out.println("¿" + l1.getNombre() + " es mayor que " + p1.getNombre() + "? " +
                (l1.esMayor(p1) ? "Sí" : "No"));

        /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Acciones automáticas");

        System.out.println("\nAcciones del perro");
        p1.hacerSonido();
        p1.alimentarse();
        p1.moverCola(3);

        System.out.println("\nAcciones del gato");
        g1.hacerSonido();
        g1.alimentarse();
        g1.saltar(3);

        System.out.println("\nAcciones del loro");
        l1.hacerSonido();
        l1.alimentarse();
    }
}
