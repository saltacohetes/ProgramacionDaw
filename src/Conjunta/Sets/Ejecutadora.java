import java.util.*;

public class Ejecutadora {
    /*
    1. Crea un programa que almacene una lista de nombres en un HashSet e imprima todos los
        nombres en la consola.
    2. Implementa un programa que añada números del 1 al 10 a un TreeSet y luego los
        imprima en orden ascendente.
    3. Diseña un programa que lea una serie de palabras desde la entrada del usuario y las
        almacene en un LinkedHashSet, asegurando que se mantenga el orden de inserción.
    4. Escribe un programa que compruebe si un elemento específico existe en un HashSet
        dado.
    5. Implementa un programa que elimine un elemento específico de un HashSet y luego
        muestre el contenido restante.
    6. Crea un programa que combine dos conjuntos (`Set`) y elimine los elementos duplicados
        resultantes.
    7. Diseña un programa que determine la intersección entre dos conjuntos y muestre los
        elementos comunes.
    8. Escribe un programa que elimine todos los elementos de un TreeSet y confirme que el
        conjunto está vacío.
    9. Crea un programa que almacene nombres en un HashSet y convierta el conjunto en una
        lista para imprimirla en orden alfabético.
    10. Implementa un programa que cuente la cantidad de elementos únicos en una lista
        utilizando un HashSet.
    11. Diseña un programa que verifique si un TreeSet es un subconjunto de otro TreeSet.
    12. Escribe un programa que almacene números aleatorios en un LinkedHashSet y garantice
        que no haya duplicados.
    13. Implementa un programa que use un HashSet para verificar si una palabra es un
        anagrama de otra, ignorando el orden de las letras.
    14. Diseña un programa que copie todos los elementos de un conjunto en otro conjunto.
    15. Crea un programa que compare dos HashSet y muestre los elementos que son exclusivos
        de cada uno.
     */

    public static void main() {
        Scanner sc = new Scanner(System.in);

        int opcion;
        String eleccion;
        Set<String> nombres = new HashSet<>();
        Set<String> nombres2 = new HashSet<>();
        Set<String> palabras = new LinkedHashSet<>();
        List<String> lista = new ArrayList<>();
        Set<String> tree1 = new TreeSet<>();
        Set<String> tree2 = new TreeSet<>();
        Set<Integer> setAleatorios = new LinkedHashSet<>();
        Set<String> origen = new HashSet<>();
        Set<String> destino = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        do {
            System.out.println("Bienvenido al sistema de gestión de ejercicios de Set");
            System.out.println("Elija la opción del ejercicio que quieres ejecutar");
            System.out.println("1. Almacenar nombres e imprimirlos");
            System.out.println("2. TreeSet ordenados");
            System.out.println("3. Guardar en un LinkedHashSet");
            System.out.println("4. Comprobar elemento");
            System.out.println("5. Eliminar elemento específico de un HashSet y mostrar");
            System.out.println("6. Combinar 2 set y eliminar duplicados");
            System.out.println("7. Determinar la intersección de dos set y mostrar los comunes");
            System.out.println("8. Eliminar todos los conjuntos de un treeSet confirmar el conjunto vacío");
            System.out.println("9. Almacenar nombres, convertirlos en lista e imprimirlos en orden alfabético");
            System.out.println("10. Contar la cantidad de elementos unicos en una lista usando un HashSet");
            System.out.println("11. Verificar si un TreeSet es un subconjunto de otro TreeSet");
            System.out.println("12. Almacenar números aleatorios en un LinkedHashSet y que no haya duplicados");
            System.out.println("13. Verificar si una palabra es anagrama de otra, ignorando el orden de las letras");
            System.out.println("14. Copiar los elementos de un conjunto en otro");
            System.out.println("15. Comparar dos HashSet y mostrar los exclusivos de cada uno");
            System.out.println("16. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1 :
                    do {
                        System.out.println("Introduce nombre para añadir al Set, escribe fin para terminar y mostrar");
                        eleccion = sc.nextLine();

                        Ejercicio1.almacenar(eleccion, nombres);
                    }while (!eleccion.equalsIgnoreCase("fin"));

                    Ejercicio1.imprimir(nombres);
                    break;
                case 2 :
                    Set<Integer> numeros = Ejercicio2.crearNumeros();
                    Ejercicio2.imprimir(numeros);
                    break;
                case 3 :
                    do {
                        System.out.println("Introduce nombre para añadir al Set, escribe fin para terminar y mostrar");
                        eleccion = sc.nextLine();

                        Ejercicio3.guardarLinkedHashSet(palabras, eleccion);
                    }while (!eleccion.equalsIgnoreCase("fin"));

                    Ejercicio3.imprimir(palabras);
                    break;
                case 4 :
                    System.out.println("Has elegido buscar un elemento en el Set, escribe lo que quieres buscar en la lista de nombres");
                    eleccion = sc.nextLine();

                    Ejercicio4.buscarElemento(nombres, eleccion);
                    break;
                case 5 :
                    System.out.println("Has elegido borrar un elemento en el Set, escribe lo que quieres borrar en la lista de nombres");
                    eleccion = sc.nextLine();

                    Ejercicio5.borrarElemento(nombres, eleccion);
                    Ejercicio5.mostrarRestantes(nombres);
                    break;
                case 6 :
                    System.out.println("Has elegido combinar 2 set");

                    Ejercicio6.combinarSet(nombres, nombres2);
                    break;
                case 7 :
                    System.out.println("Has elegido obtener los elementos comunes de 2 sets");

                    Ejercicio7.elementosComunes(nombres, nombres2);
                    break;
                case 8 :
                    System.out.println("Has elegido vaciar un set");

                    Ejercicio8.vaciarSet(nombres);
                    break;
                case 9 :
                    do {
                        System.out.println("Introduce nombre para añadir al Set, escribe fin para terminar y mostrar");
                        eleccion = sc.nextLine();

                        Ejercicio9.almacenar(nombres, eleccion);
                    }while (!eleccion.equalsIgnoreCase("fin"));

                    Ejercicio9.ordenarLista(nombres);
                    break;
                case 10 :
                    System.out.println("Has elegido contar los elementos únicos de una lista");

                    Ejercicio10.contarElementos(lista);
                    break;
                case 11 :
                    System.out.println("Has elegido verificar si un treeSet es subconjunto de otro");

                    Ejercicio11.verificarSubConjunto(tree1, tree2);
                    break;
                case 12 :
                    System.out.println("Has elegido introducir números aleatorios en un LinkedHashSet");
                    int elecAleatoria;
                    Random aleatorio = new Random();
                    do {

                        System.out.println("Introduce 1 para añadir un número aleatorio en el Set");
                        System.out.println("Introduce 0 para terminar de añadir números y mostrar el Set");
                        elecAleatoria = sc.nextInt();

                        switch (elecAleatoria){
                            case 1 :
                                int numero = aleatorio.nextInt();
                                Ejercicio12.anadirAleatorios(setAleatorios, numero);
                                break;
                            case 0 :
                                System.out.println("Mostrando el set.....");
                                break;
                            default:
                                System.out.println("Elección incorrecta, vuelve a elegir");
                        }
                    }while (elecAleatoria != 0);

                    Ejercicio12.mostrarSet(setAleatorios);
                    break;
                case 13 :
                    System.out.println("Introduce la primera palabra:");
                    String palabra1 = sc.nextLine();

                    System.out.println("Introduce la segunda palabra:");
                    String palabra2 = sc.nextLine();

                    Ejercicio13.mostrarResultado(palabra1, palabra2);
                    break;
                case 14 :
                    System.out.println("Has elegido copiar un set a otro");
                    Ejercicio14.copiarSet(origen, destino);

                    System.out.println("Contenido del set destino tras copiar:");
                    Ejercicio14.mostrarSet(destino);
                    break;
                case 15 :
                    Ejercicio15.mostrarExclusivos(set1,set2);
                    break;
                case 16 :
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Elección incorrecta, elige otra");
            }


        }while (opcion != 16);

        sc.close();
    }
}
