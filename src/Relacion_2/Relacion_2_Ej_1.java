package Relacion_2;

import java.sql.SQLOutput;
import java.util.Scanner;

//Desarrolla una aplicación que calcule el área y el perímetro de una circunferencia.
public class Relacion_2_Ej_1{
void main () {

    //Recuerda siempre declarar variables en orden si vas a hacer aqui las formulas (A veces no podras este es un caso, no tienes ni una formula aqui)
    double pi = 3.14;
    double radio;
    double area;
    double perimetro;

    //Declara el scanner si quieres guardar un numero en pantalla como el radio para esto
    Scanner sc = new Scanner(System.in);

    //Área de un círculo = π r²
    //Perímetro de un círculo = 2 · r · π
    System.out.println("Introduce el radio: ");
        radio = sc.nextInt();
    //Esto es cosa tuya pero acuerdate de separar los opradores de las varibles para un codigo mas claro
    area = pi * (radio * radio);
    perimetro = (2 * radio) * pi;
    //No hace falta que pongas un sc.nextDouble o lo que sea de ese rollo si solo quieres imprimir los resutlados en consola
    System.out.println("El area del circulo es: "+area);
    System.out.println("El permietro del circulo es: "+perimetro);



    }
}
