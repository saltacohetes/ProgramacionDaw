package ExamenHerencia;


public class Loro extends Animal {
    private String colorPlumas;
    private boolean habla;

    public Loro(String nombre, String especie, int edad, String colorPlumas, boolean habla) {
        super(nombre, especie, edad);
        this.colorPlumas = colorPlumas;
        this.habla = habla;
    }

    @Override
    public void hacerSonido() {
        if (habla) {
            System.out.println("El loro " + nombre + " dice: ¡Hola, hola!");
        } else {
            System.out.println("El loro " + nombre + " hace: ¡Squawk!");
        }
    }

    @Override
    public void alimentarse() {
        System.out.println("El loro " + nombre + " come semillas y frutas");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Color de plumas: " + colorPlumas);
        System.out.println("¿Habla?: " + (habla ? "Sí" : "No"));
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
}