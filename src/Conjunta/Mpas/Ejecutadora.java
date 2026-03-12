import java.util.*;
public class Ejecutadora{

    /*
    IMPORTANTE el getOrDefault sirve para contar cuantas veces aparece una cosa en el mapapor ejemplo
    map.put(palabra(clave), map.GetOrDefault(palabra,0)+1) el 0 es el valor por defecto, es decir, si no encuentra
    la palabra el valor es cero, y el +1 es que cada vez que encuentre la palabra suma 1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Map generales
        Map<String,String> mapaPaisCapital = new HashMap<>();
        Map<String,Integer> mapaFrecuencia = new HashMap<>();
        Map<String,String> agenda = new HashMap<>();
        Map<String,Integer> mapaLista = new HashMap<>();
        Map<String,String> diccionario = new HashMap<>();
        Map<String,List<Integer>> notasEstudiantes = new HashMap<>();
        Map<String,Integer> inventario = new HashMap<>();
        Map<Character,Integer> mapaCaracteres = new HashMap<>();
        TreeMap<Integer,EmpleadoEjercicio9> empleados = new TreeMap<>();
        Map<String,Integer> votos = new HashMap<>();

        do {
            System.out.println("\n=== MENÚ DE EJERCICIOS DE MAPS ===");
            System.out.println("1. Crear y mostrar un Map de países y capitales");
            System.out.println("2. Contar frecuencia de palabras en una frase");
            System.out.println("3. Agenda telefónica con Map");
            System.out.println("4. Convertir una lista en un Map");
            System.out.println("5. Traductor español-inglés");
            System.out.println("6. Notas de estudiantes");
            System.out.println("7. Inventario de productos");
            System.out.println("8. Contar caracteres en una palabra");
            System.out.println("9. Gestión de empleados con Map");
            System.out.println("10. Sistema de votaciones");
            System.out.println("11. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    mapaPaisCapital = Ejercicio1.crearMapa();
                    Ejercicio1.mostrarMapa(mapaPaisCapital);
                    break;

                case 2:
                    System.out.println("Introduce una frase:");
                    String frase = sc.nextLine();
                    mapaFrecuencia = Ejercicio2.contarPalabras(frase);
                    Ejercicio2.mostrarFrecuencia(mapaFrecuencia);
                    break;

                case 3:
                    System.out.println("Introduce nombre del contacto:");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce número del contacto:");
                    String numero = sc.nextLine();
                    Ejercicio3.agregarContacto(agenda, nombre, numero);
                    Ejercicio3.mostrarContactos(agenda);
                    break;

                case 4:
                    List<String> listaNombres = Arrays.asList("Ana","Juan","Ana","Luis","Juan");
                    mapaLista = Ejercicio4.listaAMapa(listaNombres);
                    Ejercicio4.mostrarMapa(mapaLista);
                    break;

                case 5:
                    Ejercicio5.agregarPalabras(diccionario);
                    System.out.println("Introduce palabra en español a traducir:");
                    String palabra = sc.nextLine();
                    Ejercicio5.traducir(diccionario, palabra);
                    break;

                case 6:
                    System.out.println("Introduce nombre del estudiante:");
                    String alumno = sc.nextLine();
                    System.out.println("Introduce notas separadas por espacios:");
                    String[] notasStr = sc.nextLine().split("\\s+");
                    /*
                     el \\s+ sirve no solo para un espacio, sino que para todos los espacios en blanco
                     da igual si son espacios normales, tabulaciones o saltos de línea
                     */

                    List<Integer> notas = new ArrayList<>();
                    for(String n : notasStr){
                        notas.add(Integer.parseInt(n));
                    }
                    Ejercicio6.agregarEstudiante(notasEstudiantes, alumno, notas);
                    Ejercicio6.mostrarPromedios(notasEstudiantes);
                    break;

                case 7:
                    System.out.println("Introduce nombre del producto:");
                    String producto = sc.nextLine();
                    System.out.println("Introduce cantidad:");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    Ejercicio7.agregarProducto(inventario, producto, cantidad);
                    Ejercicio7.mostrarInventario(inventario);
                    break;

                case 8:
                    System.out.println("Introduce una palabra:");
                    String palabraContar = sc.nextLine();
                    mapaCaracteres = Ejercicio8.contarCaracteres(palabraContar);
                    Ejercicio8.mostrarMapa(mapaCaracteres);
                    break;

                case 9:
                    System.out.println("Introduce ID del empleado:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce nombre del empleado:");
                    String nombreEmp = sc.nextLine();
                    System.out.println("Introduce salario:");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    Ejercicio9.agregarEmpleado(empleados, id, nombreEmp, salario);
                    Ejercicio9.listarEmpleados(empleados);
                    break;

                case 10:
                    System.out.println("Introduce nombre del candidato:");
                    String candidato = sc.nextLine();
                    Ejercicio10.registrarVoto(votos, candidato);
                    Ejercicio10.mostrarResultados(votos);
                    Ejercicio10.ganador(votos);
                    break;

                case 11:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta, vuelve a elegir.");
            }

        } while(opcion != 11);

        sc.close();
    }
}