import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
    public static Map<String,String> crearMapa(){
        Map<String,String> mapa = new HashMap<>();
        mapa.put("España","Madrid");
        mapa.put("Francia","París");
        mapa.put("Italia","Roma");
        mapa.put("Alemania","Berlín");
        mapa.put("Portugal","Lisboa");
        return mapa;
    }

    public static void mostrarMapa(Map<String,String> mapa){
        for(Map.Entry<String,String> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
