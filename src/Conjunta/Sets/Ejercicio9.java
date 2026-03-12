import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;

public class Ejercicio9 {

    public static void almacenar(Set<String> set, String nombre){
        set.add(nombre);
    }

    public static ArrayList<String> ordenarLista(Set<String> set){
        ArrayList<String> ordenados = new ArrayList<>(set);
        ordenados.sort(Comparator.naturalOrder());
        return ordenados;
    }
}
