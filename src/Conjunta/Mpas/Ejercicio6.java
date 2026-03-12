import java.util.List;
import java.util.Map;

public class Ejercicio6 {
    public static void agregarEstudiante(Map<String, List<Integer>> mapa, String nombre, List<Integer> notas){
        mapa.put(nombre, notas);
    }

    public static void mostrarPromedios(Map<String,List<Integer>> mapa){
        for(Map.Entry<String,List<Integer>> entry : mapa.entrySet()){
            List<Integer> notas = entry.getValue();
            double promedio = notas.stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.println(entry.getKey() + " -> " + promedio);
        }
    }
}
