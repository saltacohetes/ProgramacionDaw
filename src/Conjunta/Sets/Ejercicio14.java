import java.util.Set;

public class Ejercicio14 {

    public static void copiarSet(Set<String> setOrigen, Set<String> setDestino){
        setDestino.addAll(setOrigen);
    }

    public static void mostrarSet(Set<String> set){
        for(String elemento : set){
            System.out.println(elemento);
        }
    }
}