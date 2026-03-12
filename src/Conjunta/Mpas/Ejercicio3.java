import java.util.Map;

public class Ejercicio3 {
    public static void agregarContacto(Map<String,String> agenda, String nombre, String numero){
        agenda.put(nombre, numero);
    }

    public static void buscarNumero(Map<String,String> agenda, String nombre){
        if(agenda.containsKey(nombre)){
            System.out.println(nombre + " -> " + agenda.get(nombre));
        } else {
            System.out.println("No se encontró el contacto");
        }
    }

    public static void mostrarContactos(Map<String,String> agenda){
        for(Map.Entry<String,String> entry : agenda.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
