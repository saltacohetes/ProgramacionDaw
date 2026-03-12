import java.util.HashSet;
import java.util.Set;

public class Ejercicio7 {

    public static Set<String> elementosComunes(Set<String> set1, Set<String> set2){
        Set<String> comunes = new HashSet<>(set1);
        comunes.retainAll(set2);
        return comunes;
    }
}
