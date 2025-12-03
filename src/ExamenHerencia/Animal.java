package ExamenHerencia;


public abstract class Animal {
    protected String nombre;
    protected String especie;
    protected int edad;

    public Animal() {
        this.nombre = "";
        this.especie = "";
        this.edad = 0;
    }

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public abstract void hacerSonido();
    public abstract void alimentarse();

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + "Espedcie: " +especie + "Edad: "+edad);

    }

    public boolean esMayor(Animal otro) {
        return this.edad > otro.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
