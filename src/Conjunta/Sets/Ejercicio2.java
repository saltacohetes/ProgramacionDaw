import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

    public static Set<Integer> crearNumeros(){
        Set<Integer> numeros = new TreeSet<>();

        for (int i = 1; i <= 10; i++){
            numeros.add(i);
        }
        return numeros;
    }

    public static void imprimir(Set<Integer> numeros){
        for (int n : numeros){
            System.out.println(n);
        }
    }
}
