import java.util.Map;

public class Ejercicio5 {
    public static void agregarPalabras(Map<String,String> diccionario){
        diccionario.put("hola","hello");
        diccionario.put("adios","goodbye");
        diccionario.put("casa","house");
        diccionario.put("perro","dog");
        diccionario.put("gato","cat");
    }

    public static void traducir(Map<String,String> diccionario, String palabra){
        if(diccionario.containsKey(palabra)){
            System.out.println(palabra + " -> " + diccionario.get(palabra));
        } else {
            System.out.println("La palabra no está en el diccionario");
        }
    }
}
