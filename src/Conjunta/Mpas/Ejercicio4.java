import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio4 {
    public static Map<String,Integer> listaAMapa(List<String> lista){
        Map<String,Integer> mapa = new HashMap<>();
        for(String nombre : lista){
            mapa.put(nombre, mapa.getOrDefault(nombre,0) + 1);
        }
        return mapa;
    }

    public static void mostrarMapa(Map<String,Integer> mapa){
        for(Map.Entry<String,Integer> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
