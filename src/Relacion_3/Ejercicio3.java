package Relacion_3;
//  Ejercicio 3: Cálculo de notas y promedio
//        Desarrolla un programa que pida al usuario las notas de 5 materias. Luego,
//        calcula el promedio y utiliza `if-else` para asignar una calificación:
//        - A (90-100)
//        - B (80-89)
//        - C (70-79)
//        - D (60-69)
//        - F (menos de 60)
//        Si alguna nota es negativa o mayor a 100, mostrar un error.
import java.util.Scanner;

public class Ejercicio3 {
    public static void main() {

        Scanner sc = new Scanner(System.in);

        int materia1;
        int materia2;
        int materia3;
        int materia4;
        int materia5;
        int notafinal;

        System.out.println("Introduce la nota de programación: ");
        materia1 = sc.nextInt();

        System.out.println("Introduce la nota de bases de datos: ");
        materia2 = sc.nextInt();

        System.out.println("Introduce la nota de sistemas: ");
        materia3 = sc.nextInt();

        System.out.println("Introduce la nota de entornos: ");
        materia4 = sc.nextInt();

        System.out.println("Introduce la nota de fol: ");
        materia5 = sc.nextInt();

        int promedio = (materia1 + materia2 + materia3 + materia4 + materia5) / 5;

        if (promedio >= 90 && promedio <= 100){
            System.out.println("Tu nota final es A");
        }
        else if (promedio >= 80 && promedio <= 89){
            System.out.println("Tu nota final es B");
        }
        else if (promedio >= 70 && promedio <= 79){
            System.out.println("Tu nota final es C");
        }
        else if (promedio >= 60 && promedio <= 69) {
            System.out.println("Tu nota final es D");
        }
        else if (promedio < 60) {
            System.out.println("Tu nota final es F");
        }
        else {
            System.out.println("ERROR");
        }
    }
}
