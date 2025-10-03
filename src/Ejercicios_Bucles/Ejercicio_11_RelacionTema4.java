package Ejercicios_Bucles;

import java.util.Scanner;

//Imprimir números primos hasta 100
//Escribe un programa que imprima todos los números primos entre 1 y 100.
public class Ejercicio_11_RelacionTema4 {
    static void main() {
        //Aqui declaras la variable apra no declararla en cada iteracion

        boolean EsPrimo;
        //Bucle anidado
        //EN este bucle esta comprobando que tu dividendo esta entre 1 y 100
        for (int dividendo = 1; dividendo < 101; dividendo++){
            //Asignas aqui valor a tu booleano como true porque te interesa para comprobar cada dividendo.
            EsPrimo = true;
            //
            for (int divisor = 2; divisor < dividendo; divisor++){
                //Recuerda poneer == para realizar la comprobacion de igualdad (Es lo mismo que .equals). Aqwui compruebas si een dividendo y el divisor es igual que 0
                if ((dividendo % divisor) == 0){
                    EsPrimo = false;
                }
            }
            //Dentro de if puedo poner la variable sin el == true ya que al ser booleano ya se comprueba por defecto como == a true
            if (EsPrimo){
               System.out.println(dividendo+" Es primo");
           }
        }
    }
}
