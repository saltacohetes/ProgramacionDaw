package Clases;

public class Main {
    public static void main() {
        //Las instancias de los animales
        Animal animal = new Animal();
        Animal perro = new Perro();
        Animal gato = new Gato();

        System.out.println("=== Sonidos de los animales ===");
        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();

        System.out.println("=== Demostración de polimorfismo ===");
        hacerSonidoAnimal(animal);
        hacerSonidoAnimal(perro);
        hacerSonidoAnimal(gato);

        System.out.println("=== Creación directa ===");
        Perro miPerro = new Perro();
        Gato miGato = new Gato();

        miPerro.hacerSonido();
        miGato.hacerSonido();
    }

    public static void hacerSonidoAnimal(Animal animal) {
        System.out.print("Desde el método: ");
        animal.hacerSonido();
    }
}