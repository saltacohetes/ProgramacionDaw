import java.util.Set;

public class Ejercicio8 {

    public static void vaciarSet(Set<String> set){
        set.clear();
        if (set.isEmpty()){
            System.out.println("Se ha borrado el set correctamente");
        }else {
            System.out.println("El set no se ha podido borrar");
        }
    }
}
