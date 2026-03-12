import java.util.HashSet;
import java.util.Set;

public class Ejercicio6 {

    public static Set<String> combinarSet(Set<String> set1, Set<String> set2){
        Set<String> combinado = new HashSet<>(set1);
        combinado.addAll(set2);
        return combinado;
    }
}
