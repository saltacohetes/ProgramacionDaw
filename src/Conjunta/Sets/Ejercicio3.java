import java.util.Set;

public class Ejercicio3 {

    public static void guardarLinkedHashSet(Set<String> linkedHashSet, String palabra){
        linkedHashSet.add(palabra);
    }

    public static void imprimir(Set<String> linkedHashSet){
        for (String palabra : linkedHashSet){
            System.out.println(palabra);
        }
    }
}
