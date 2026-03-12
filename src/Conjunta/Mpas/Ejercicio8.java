import java.util.HashMap;
import java.util.Map;

public class Ejercicio8 {
    public static Map<Character,Integer> contarCaracteres(String palabra){
        Map<Character,Integer> mapa = new HashMap<>();
        for(char c : palabra.toCharArray()){
            mapa.put(c, mapa.getOrDefault(c,0)+1);
        }
        return mapa;
    }

    public static void mostrarMapa(Map<Character,Integer> mapa){
        for(Map.Entry<Character,Integer> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}