import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio10 {

    public static void contarElementos(List<String> lista){

        Set<String> unicos = new HashSet<>(lista);

        System.out.println("El set tiene " +unicos.size() +" únicos");
    }
}
