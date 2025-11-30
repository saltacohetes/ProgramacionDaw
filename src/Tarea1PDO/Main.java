package Practica1PDO;

public class Main {
    public static void main() {

        // Crear empleados
        Empleado e1 = new Empleado("Pedro", "Pérez", 1300, 'B', 2);
        Empleado e2 = new Empleado("Ana Díez");
        Empleado e3 = new Empleado("Carmen", "Lorenzo", 1250, 'D', 6);

        System.out.println("=== Datos iniciales ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("Número de empleados: " + Empleado.getNumEmpleados());

        // Aplicar prima del 10%
        Empleado.setPrima(10);

        // Pedro asciende a categoría C
        e1.setCategoria('C');

        System.out.println("=== Datos tras prima del 10% y ascenso de Pedro ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println("Número de empleados: " + Empleado.getNumEmpleados());
    }
}
