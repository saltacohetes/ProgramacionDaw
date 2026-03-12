import java.util.Map;

public class Ejercicio7 {
    public static void agregarProducto(Map<String,Integer> inventario, String producto, int cantidad){
        inventario.put(producto, inventario.getOrDefault(producto,0) + cantidad);
    }

    public static void actualizarProducto(Map<String,Integer> inventario, String producto, int cantidad){
        inventario.put(producto, cantidad);
    }

    public static void eliminarProducto(Map<String,Integer> inventario, String producto){
        inventario.remove(producto);
    }

    public static void mostrarInventario(Map<String,Integer> inventario){
        for(Map.Entry<String,Integer> entry : inventario.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}