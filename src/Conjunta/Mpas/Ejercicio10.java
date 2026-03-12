import java.util.Map;

public class Ejercicio10 {
    public static void registrarVoto(Map<String,Integer> votos, String candidato){
        votos.put(candidato, votos.getOrDefault(candidato,0)+1);
    }

    public static void mostrarResultados(Map<String,Integer> votos){
        for(Map.Entry<String,Integer> entry : votos.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void ganador(Map<String,Integer> votos){
        String ganador = null;
        int max = -1;
        for(Map.Entry<String,Integer> entry : votos.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                ganador = entry.getKey();
            }
        }
        System.out.println("El ganador es: " + ganador + " con " + max + " votos");
    }
}