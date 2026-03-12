import java.util.HashSet;
import java.util.Set;

public class Ejercicio13 {

    public static Set<Character> convertirASet(String palabra){
        Set<Character> set = new HashSet<>();
        palabra = palabra.toLowerCase(); // ignorar mayúsculas/minúsculas
        for(char c : palabra.toCharArray()){
            set.add(c);
        }
        return set;
    }

    public static boolean sonAnagramas(String palabra1, String palabra2){
        Set<Character> set1 = convertirASet(palabra1);
        Set<Character> set2 = convertirASet(palabra2);

        return set1.equals(set2);
    }

    public static void mostrarResultado(String palabra1, String palabra2){
        if(sonAnagramas(palabra1, palabra2)){
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" son anagramas (ignorando orden y duplicados).");
        } else {
            System.out.println("Las palabras \"" + palabra1 + "\" y \"" + palabra2 + "\" NO son anagramas.");
        }
    }
}