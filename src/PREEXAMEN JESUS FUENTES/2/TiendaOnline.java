import java.sql.SQLOutput;
import java.util.*;

public class TiendaOnline {

    private HashMap<String, Producto> productos;
    private Scanner sc;

    public TiendaOnline() {
        productos = new HashMap<>();
        sc = new Scanner(System.in);
        cargarProductosIniciales();
    }


    public void iniciar() {
        int opcion;

        do {
            System.out.println("Tienda Online");
            System.out.println("1.Alta de producto");
            System.out.println("2.Modificar stock");
            System.out.println("3.Listado productos disponibles");
            System.out.println("4.Listado productos sin stock");
            System.out.println("5.Borrar producto");
            System.out.println("6.Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    altaProducto();
                    break;

                case 2:
                    modificarStock();
                    break;

                case 3:
                    ListarDisponibles();
                    break;

                case 4:
                    ListarSinStock();
                    break;

                case 5:
                    BorrarProducto();
                    break;

            }

        } while (opcion != 6);
    }
    private void cargarProductosIniciales() {

        productos.put("P001", new Producto("P001", "Teclado", 25.5, 10, true));
        productos.put("P002", new Producto("P002", "Raton", 10, 10, true));
        productos.put("P003", new Producto("P003", "Monitor", 180, 10, true));
        productos.put("P004", new Producto("P004", "Auriculares", 40, 10, true));
        productos.put("P005", new Producto("P005", "Webcam", 60, 10, true));
    }

    private void altaProducto() {
        System.out.println("CODIGO DEL PRODUCTO");
        String codigo = sc.next();
        if (productos.containsKey(codigo)) {
            System.out.println("El producto ya existe");
        }
        System.out.println("NOMBRE DEL PRODUCTO:");
        String nombre = sc.next();
        System.out.println("PRECIO:");
        double precio = sc.nextDouble();
        System.out.println("STOCK: ");
        int stock = sc.nextInt();

        productos.put(codigo, new Producto(codigo, nombre, precio, stock, true));
    }
    private void ListarDisponibles() {
        ArrayList<Producto> dispo = new ArrayList<>();
        for (Producto p : productos.values()) {
            if (p.isDisponible()) {
                dispo.add(p);
            }
        }
        Collections.sort(dispo, new Comparator<Producto>() {
            @Override
            public int compare(Producto p1, Producto p2) {
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }
        });
        for (Producto p : dispo) {
            System.out.println(p);
        }
    }

    private void modificarStock() {
        System.out.println("Codigo del producto: ");
        String codigo = sc.nextLine();
        Producto producto = productos.get(codigo);
        if (producto == null) {
            System.out.println("El producto no existe");
        }

        System.out.println("Nuevo stock: ");
        int nuevostock = sc.nextInt();
        sc.nextLine();
        producto.setStock(nuevostock);
        System.out.println("Modificando stock");

    }
    private void ListarSinStock() {
        for (Producto p : productos.values()) {
            if (p.getStock() == 0){
                System.out.println(p);
            }
        }
    }

    private void BorrarProducto() {
        System.out.println("Codigo del producto: ");
        String codigo = sc.nextLine();
        if(productos.remove(codigo) != null) {
            System.out.println("Producto eliminado exitosamente");
        }else  {
            System.out.println("ERROR");
        }
    }
}


