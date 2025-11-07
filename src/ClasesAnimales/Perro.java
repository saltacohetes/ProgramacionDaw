package Clases;

class Perro extends Animal {
    // Sobrescribe el método hacerSonido
    @Override
    public void hacerSonido() {

        System.out.println("El perro hace: ¡Guau guau!");
    }
}