import java.util.Map;
import java.util.TreeMap;

public class Ejercicio9 {
    public static void agregarEmpleado(TreeMap<Integer,EmpleadoEjercicio9> mapa, int id, String nombre, double salario){
        mapa.put(id, new EmpleadoEjercicio9(nombre, salario));
    }

    public static void buscarEmpleado(TreeMap<Integer,EmpleadoEjercicio9> mapa, int id){
        if(mapa.containsKey(id)){
            System.out.println(id + " -> " + mapa.get(id));
        } else {
            System.out.println("Empleado no encontrado");
        }
    }

    public static void listarEmpleados(TreeMap<Integer,EmpleadoEjercicio9> mapa){
        for(Map.Entry<Integer,EmpleadoEjercicio9> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
