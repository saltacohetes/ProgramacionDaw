import java.util.HashSet;
import java.util.Set;

public class Ejercicio15 {

    public static void mostrarExclusivos(Set<String> set1, Set<String> set2){

        Set<String> exclusivosSet1 = new HashSet<>(set1);
        Set<String> exclusivosSet2 = new HashSet<>(set2);

        exclusivosSet1.removeAll(set2);

        exclusivosSet2.removeAll(set1);

        System.out.println("Elementos exclusivos del primer Set:");
        for(String e : exclusivosSet1){
            System.out.println(e);
        }

        System.out.println("Elementos exclusivos del segundo Set:");
        for(String e : exclusivosSet2){
            System.out.println(e);
        }
    }
}