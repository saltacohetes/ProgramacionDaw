import java.util.Set;

public class Ejercicio5 {

    public static void borrarElemento (Set<String> nombres, String buscado){
        if (nombres.isEmpty()){
            System.out.println("El HashSet está vacío y no se puede buscar nada");
            return;
        }
        if (!nombres.contains(buscado)){
            System.out.println("El elemento buscado no está en el Set");
            return;
        } else {
            nombres.remove(buscado);
            System.out.println("El elemento: " +buscado +" ha sido borrado correctamente");
        }
    }

    public static void mostrarRestantes(Set<String> nombres){
        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
