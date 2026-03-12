import java.util.Set;

public class Ejercicio12 {

    public static void anadirAleatorios(Set<Integer> numeros, Integer aleatorio){
        numeros.add(aleatorio);
    }

    public static void mostrarSet(Set<Integer> numeros){
        for (int numero : numeros){
            System.out.println(numero);
        }
    }
}
