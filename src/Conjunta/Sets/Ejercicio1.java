import java.util.Set;

public class Ejercicio1 {

    public static void almacenar(String nombre, Set<String> set){
        set.add(nombre);
    }

    public static void imprimir(Set<String> set){
        for (String nombre : set){
            System.out.println(nombre);
        }
    }
}
