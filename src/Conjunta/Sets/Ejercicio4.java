import java.util.Set;

public class Ejercicio4 {

    public static void buscarElemento(Set<String> nombres, String buscado){
        if (nombres.isEmpty()){
            System.out.println("El HashSet está vacío y no se puede buscar nada");
            return;
        }
        if (nombres.contains(buscado)){
            System.out.println("Se ha encontrado la coincidencia en el Set");
        } else System.out.println("El Set no contiene el elemento buscado");



    }
}
