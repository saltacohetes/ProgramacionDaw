public class Socio {
    // Atributos
    private String nombre;
    private String dni;
    private int edad;
    private String fechaInscripcion;
    private boolean activo;


    public Socio(String nombre, String dni, int edad, String fechaInscripcion) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.fechaInscripcion = fechaInscripcion;
        this.activo = true; // Por defecto, nuevo socio activo
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    @Override
    public String toString() {
        return "==================================" +
                "\nDATOS DEL SOCIO" +
                "\n==================================" +
                "\nNombre: " + nombre +
                "\nDNI: " + dni +
                "\nEdad: " + edad + " años" +
                "\nFecha de inscripción: " + fechaInscripcion +
                "\nEstado: " + (activo ? "ACTIVO" : "INACTIVO") +
                "\n==================================";
    }
}