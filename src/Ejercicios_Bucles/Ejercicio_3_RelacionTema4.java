package Ejercicios_Bucles;

//Escribe un programa que imprima solo los números pares del 1 al 20.
public class Ejercicio_3_RelacionTema4 {
    static void main() {
        for (int i = 1 ; i <=20 ; i++) {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }

        //Esta lee menos numeros
        for (int i = 2 ; i <= 20 ; i+=2){
            System.out.println(i);
        }

    }
}
