import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
    public static Map<String,Integer> contarPalabras(String frase){
        Map<String,Integer> frecuencia = new HashMap<>();
        String[] palabras = frase.split("\\s+");
        for(String palabra : palabras){
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra,0) + 1);
        }
        return frecuencia;
    }

    public static void mostrarFrecuencia(Map<String,Integer> mapa){
        for(Map.Entry<String,Integer> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}