package Practica1PDO;

class Empleado {

    private String nombre;
    private String apellidos;
    private double sueldoBase;
    // en porcentaje
    private double retenciones;
    private char categoria;

    private static int numEmpleados = 0;
    // porcentaje, escritura desde fuera
    private static double prima = 0;

    // Constructor completo
    public Empleado(String nombre, String apellidos, double sueldoBase, char categoria, double retenciones) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sueldoBase = sueldoBase;
        this.categoria = categoria;
        this.retenciones = retenciones;
        numEmpleados++;
    }

    // Constructor solo con nombre
    public Empleado(String nombre) {
        this.nombre = nombre;
        this.apellidos = "";
        this.sueldoBase = 1500;
        this.categoria = 'A';
        this.retenciones = 5;
        numEmpleados++;
    }

    public static int getNumEmpleados() {
        return numEmpleados;
    }

    public static void setPrima(double p) {
        prima = p;
    }

    public void setCategoria(char c) {
        this.categoria = c;
    }

    //   Metodo para calcullarSueldo
    public double calcularSueldo() {

        double incrementoCategoria = 0;

        switch (Character.toUpperCase(categoria)) {
            case 'A': incrementoCategoria = 100; break;
            case 'B': incrementoCategoria = 200; break;
            case 'C': incrementoCategoria = 300; break;
            case 'D': incrementoCategoria = 500; break;
        }

        double sueldo = sueldoBase + incrementoCategoria;

        // aplicar prima global (porcentaje sobre sueldo base)
        sueldo += sueldoBase * (prima / 100);

        // aplicar retenciones
        sueldo -= sueldo * (retenciones / 100);

        return sueldo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos +
                " | Sueldo: " + String.format("%.2f €", calcularSueldo());
    }
}
